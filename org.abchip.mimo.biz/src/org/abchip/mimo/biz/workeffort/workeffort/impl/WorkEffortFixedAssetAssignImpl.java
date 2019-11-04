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

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Fixed Asset Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getAllocatedCost <em>Allocated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortFixedAssetAssignImpl#getAvailabilityStatusId <em>Availability Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortFixedAssetAssignImpl extends BizEntityImpl implements WorkEffortFixedAssetAssign {
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
	 * The default value of the '{@link #getAllocatedCost() <em>Allocated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ALLOCATED_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocatedCost() <em>Allocated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal allocatedCost = ALLOCATED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getAvailabilityStatusId() <em>Availability Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem availabilityStatusId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortFixedAssetAssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_FIXED_ASSET_ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAllocatedCost() {
		return allocatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatedCost(BigDecimal newAllocatedCost) {
		BigDecimal oldAllocatedCost = allocatedCost;
		allocatedCost = newAllocatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST, oldAllocatedCost, allocatedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getAvailabilityStatusId() {
		if (availabilityStatusId != null && ((EObject)availabilityStatusId).eIsProxy()) {
			InternalEObject oldAvailabilityStatusId = (InternalEObject)availabilityStatusId;
			availabilityStatusId = (StatusItem)eResolveProxy(oldAvailabilityStatusId);
			if (availabilityStatusId != oldAvailabilityStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID, oldAvailabilityStatusId, availabilityStatusId));
			}
		}
		return availabilityStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetAvailabilityStatusId() {
		return availabilityStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityStatusId(StatusItem newAvailabilityStatusId) {
		StatusItem oldAvailabilityStatusId = availabilityStatusId;
		availabilityStatusId = newAvailabilityStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID, oldAvailabilityStatusId, availabilityStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS, oldComments, comments));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
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
		FixedAsset oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST:
				return getAllocatedCost();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS:
				return getComments();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE:
				return getThruDate();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID:
				if (resolve) return getAvailabilityStatusId();
				return basicGetAvailabilityStatusId();
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST:
				setAllocatedCost((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS:
				setComments((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId((StatusItem)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST:
				setAllocatedCost(ALLOCATED_COST_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId((StatusItem)null);
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
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST:
				return ALLOCATED_COST_EDEFAULT == null ? allocatedCost != null : !ALLOCATED_COST_EDEFAULT.equals(allocatedCost);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID:
				return statusId != null;
			case WorkeffortPackage.WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID:
				return availabilityStatusId != null;
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
		result.append(", allocatedCost: ");
		result.append(allocatedCost);
		result.append(", comments: ");
		result.append(comments);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortFixedAssetAssignImpl
