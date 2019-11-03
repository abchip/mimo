/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Good Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getWorkEffortGoodStdTypeId <em>Work Effort Good Std Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getEstimatedQuantity <em>Estimated Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortGoodStandardImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortGoodStandardImpl extends BizEntityTypedImpl<WorkEffortGoodStandardType> implements WorkEffortGoodStandard {
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
	 * The default value of the '{@link #getWorkEffortGoodStdTypeId() <em>Work Effort Good Std Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortGoodStdTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_GOOD_STD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortGoodStdTypeId() <em>Work Effort Good Std Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortGoodStdTypeId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortGoodStdTypeId = WORK_EFFORT_GOOD_STD_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

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
	protected WorkEffortGoodStandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_GOOD_STANDARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST, oldEstimatedCost, estimatedCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY, oldEstimatedQuantity, estimatedQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortGoodStdTypeId() {
		return workEffortGoodStdTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortGoodStdTypeId(String newWorkEffortGoodStdTypeId) {
		String oldWorkEffortGoodStdTypeId = workEffortGoodStdTypeId;
		workEffortGoodStdTypeId = newWorkEffortGoodStdTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID, oldWorkEffortGoodStdTypeId, workEffortGoodStdTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID:
				return getProductId();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID:
				return getWorkEffortGoodStdTypeId();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST:
				return getEstimatedCost();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY:
				return getEstimatedQuantity();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__STATUS_ID:
				return getStatusId();
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID:
				setWorkEffortGoodStdTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST:
				setEstimatedCost((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY:
				setEstimatedQuantity((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID:
				setWorkEffortGoodStdTypeId(WORK_EFFORT_GOOD_STD_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY:
				setEstimatedQuantity(ESTIMATED_QUANTITY_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID:
				return WORK_EFFORT_GOOD_STD_TYPE_ID_EDEFAULT == null ? workEffortGoodStdTypeId != null : !WORK_EFFORT_GOOD_STD_TYPE_ID_EDEFAULT.equals(workEffortGoodStdTypeId);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST:
				return ESTIMATED_COST_EDEFAULT == null ? estimatedCost != null : !ESTIMATED_COST_EDEFAULT.equals(estimatedCost);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY:
				return estimatedQuantity != ESTIMATED_QUANTITY_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case WorkeffortPackage.WORK_EFFORT_GOOD_STANDARD__THRU_DATE:
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", workEffortGoodStdTypeId: ");
		result.append(workEffortGoodStdTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", estimatedCost: ");
		result.append(estimatedCost);
		result.append(", estimatedQuantity: ");
		result.append(estimatedQuantity);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortGoodStandardImpl
