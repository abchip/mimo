/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getWorkEffortIdFrom <em>Work Effort Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocImpl#getWorkEffortIdTo <em>Work Effort Id To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortAssocImpl extends BizEntityTypedImpl<WorkEffortAssocType> implements WorkEffortAssoc {
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
	 * The cached value of the '{@link #getWorkEffortAssocTypeId() <em>Work Effort Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffortAssocType workEffortAssocTypeId;

	/**
	 * The cached value of the '{@link #getWorkEffortIdFrom() <em>Work Effort Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdFrom()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortIdFrom;

	/**
	 * The cached value of the '{@link #getWorkEffortIdTo() <em>Work Effort Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdTo()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortIdTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_ASSOC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssocType getWorkEffortAssocTypeId() {
		if (workEffortAssocTypeId != null && ((EObject)workEffortAssocTypeId).eIsProxy()) {
			InternalEObject oldWorkEffortAssocTypeId = (InternalEObject)workEffortAssocTypeId;
			workEffortAssocTypeId = (WorkEffortAssocType)eResolveProxy(oldWorkEffortAssocTypeId);
			if (workEffortAssocTypeId != oldWorkEffortAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID, oldWorkEffortAssocTypeId, workEffortAssocTypeId));
			}
		}
		return workEffortAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffortAssocType basicGetWorkEffortAssocTypeId() {
		return workEffortAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortAssocTypeId(WorkEffortAssocType newWorkEffortAssocTypeId) {
		WorkEffortAssocType oldWorkEffortAssocTypeId = workEffortAssocTypeId;
		workEffortAssocTypeId = newWorkEffortAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID, oldWorkEffortAssocTypeId, workEffortAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortIdFrom() {
		if (workEffortIdFrom != null && ((EObject)workEffortIdFrom).eIsProxy()) {
			InternalEObject oldWorkEffortIdFrom = (InternalEObject)workEffortIdFrom;
			workEffortIdFrom = (WorkEffort)eResolveProxy(oldWorkEffortIdFrom);
			if (workEffortIdFrom != oldWorkEffortIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM, oldWorkEffortIdFrom, workEffortIdFrom));
			}
		}
		return workEffortIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortIdFrom() {
		return workEffortIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortIdFrom(WorkEffort newWorkEffortIdFrom) {
		WorkEffort oldWorkEffortIdFrom = workEffortIdFrom;
		workEffortIdFrom = newWorkEffortIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM, oldWorkEffortIdFrom, workEffortIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortIdTo() {
		if (workEffortIdTo != null && ((EObject)workEffortIdTo).eIsProxy()) {
			InternalEObject oldWorkEffortIdTo = (InternalEObject)workEffortIdTo;
			workEffortIdTo = (WorkEffort)eResolveProxy(oldWorkEffortIdTo);
			if (workEffortIdTo != oldWorkEffortIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO, oldWorkEffortIdTo, workEffortIdTo));
			}
		}
		return workEffortIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortIdTo() {
		return workEffortIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortIdTo(WorkEffort newWorkEffortIdTo) {
		WorkEffort oldWorkEffortIdTo = workEffortIdTo;
		workEffortIdTo = newWorkEffortIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO, oldWorkEffortIdTo, workEffortIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_ASSOC__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_ASSOC__SEQUENCE_NUM:
				return getSequenceNum();
			case WorkeffortPackage.WORK_EFFORT_ASSOC__THRU_DATE:
				return getThruDate();
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID:
				if (resolve) return getWorkEffortAssocTypeId();
				return basicGetWorkEffortAssocTypeId();
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM:
				if (resolve) return getWorkEffortIdFrom();
				return basicGetWorkEffortIdFrom();
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO:
				if (resolve) return getWorkEffortIdTo();
				return basicGetWorkEffortIdTo();
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId((WorkEffortAssocType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM:
				setWorkEffortIdFrom((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO:
				setWorkEffortIdTo((WorkEffort)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId((WorkEffortAssocType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM:
				setWorkEffortIdFrom((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO:
				setWorkEffortIdTo((WorkEffort)null);
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_ASSOC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID:
				return workEffortAssocTypeId != null;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM:
				return workEffortIdFrom != null;
			case WorkeffortPackage.WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO:
				return workEffortIdTo != null;
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

} //WorkEffortAssocImpl
