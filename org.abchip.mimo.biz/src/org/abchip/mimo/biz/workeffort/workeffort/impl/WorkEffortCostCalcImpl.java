/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostComponentType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Cost Calc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortCostCalcImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortCostCalcImpl extends BizEntityImpl implements WorkEffortCostCalc {
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
	protected WorkEffortCostCalcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_COST_CALC;
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
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
		CostComponentCalc oldCostComponentCalcId = costComponentCalcId;
		costComponentCalcId = newCostComponentCalcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID, oldCostComponentTypeId, costComponentTypeId));
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
		CostComponentType oldCostComponentTypeId = costComponentTypeId;
		costComponentTypeId = newCostComponentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID, oldCostComponentTypeId, costComponentTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_COST_CALC__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_COST_CALC__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_COST_CALC__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__THRU_DATE:
				return getThruDate();
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID:
				if (resolve) return getCostComponentTypeId();
				return basicGetCostComponentTypeId();
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID:
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
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID:
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
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID:
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
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID:
				return costComponentTypeId != null;
			case WorkeffortPackage.WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID:
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortCostCalcImpl
