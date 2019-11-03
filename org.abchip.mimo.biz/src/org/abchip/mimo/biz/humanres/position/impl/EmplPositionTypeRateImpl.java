/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.position.EmplPositionTypeRate;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position Type Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getPayGradeId <em>Pay Grade Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getSalaryStepSeqId <em>Salary Step Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeRateImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionTypeRateImpl extends BizEntityImpl implements EmplPositionTypeRate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionTypeId = EMPL_POSITION_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateTypeId() <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateTypeId() <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected String rateTypeId = RATE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPayGradeId() <em>Pay Grade Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayGradeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAY_GRADE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayGradeId() <em>Pay Grade Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayGradeId()
	 * @generated
	 * @ordered
	 */
	protected String payGradeId = PAY_GRADE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalaryStepSeqId() <em>Salary Step Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryStepSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALARY_STEP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalaryStepSeqId() <em>Salary Step Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryStepSeqId()
	 * @generated
	 * @ordered
	 */
	protected String salaryStepSeqId = SALARY_STEP_SEQ_ID_EDEFAULT;

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
	protected EmplPositionTypeRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION_TYPE_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionTypeId() {
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(String newEmplPositionTypeId) {
		String oldEmplPositionTypeId = emplPositionTypeId;
		emplPositionTypeId = newEmplPositionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayGradeId() {
		return payGradeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayGradeId(String newPayGradeId) {
		String oldPayGradeId = payGradeId;
		payGradeId = newPayGradeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID, oldPayGradeId, payGradeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateTypeId() {
		return rateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateTypeId(String newRateTypeId) {
		String oldRateTypeId = rateTypeId;
		rateTypeId = newRateTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalaryStepSeqId() {
		return salaryStepSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalaryStepSeqId(String newSalaryStepSeqId) {
		String oldSalaryStepSeqId = salaryStepSeqId;
		salaryStepSeqId = newSalaryStepSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID, oldSalaryStepSeqId, salaryStepSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_RATE__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID:
				return getEmplPositionTypeId();
			case PositionPackage.EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID:
				return getRateTypeId();
			case PositionPackage.EMPL_POSITION_TYPE_RATE__FROM_DATE:
				return getFromDate();
			case PositionPackage.EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID:
				return getPayGradeId();
			case PositionPackage.EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID:
				return getSalaryStepSeqId();
			case PositionPackage.EMPL_POSITION_TYPE_RATE__THRU_DATE:
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
			case PositionPackage.EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID:
				setRateTypeId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID:
				setPayGradeId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__THRU_DATE:
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
			case PositionPackage.EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId(EMPL_POSITION_TYPE_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID:
				setRateTypeId(RATE_TYPE_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID:
				setPayGradeId(PAY_GRADE_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId(SALARY_STEP_SEQ_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_RATE__THRU_DATE:
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
			case PositionPackage.EMPL_POSITION_TYPE_RATE__EMPL_POSITION_TYPE_ID:
				return EMPL_POSITION_TYPE_ID_EDEFAULT == null ? emplPositionTypeId != null : !EMPL_POSITION_TYPE_ID_EDEFAULT.equals(emplPositionTypeId);
			case PositionPackage.EMPL_POSITION_TYPE_RATE__RATE_TYPE_ID:
				return RATE_TYPE_ID_EDEFAULT == null ? rateTypeId != null : !RATE_TYPE_ID_EDEFAULT.equals(rateTypeId);
			case PositionPackage.EMPL_POSITION_TYPE_RATE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PositionPackage.EMPL_POSITION_TYPE_RATE__PAY_GRADE_ID:
				return PAY_GRADE_ID_EDEFAULT == null ? payGradeId != null : !PAY_GRADE_ID_EDEFAULT.equals(payGradeId);
			case PositionPackage.EMPL_POSITION_TYPE_RATE__SALARY_STEP_SEQ_ID:
				return SALARY_STEP_SEQ_ID_EDEFAULT == null ? salaryStepSeqId != null : !SALARY_STEP_SEQ_ID_EDEFAULT.equals(salaryStepSeqId);
			case PositionPackage.EMPL_POSITION_TYPE_RATE__THRU_DATE:
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
		result.append(" (emplPositionTypeId: ");
		result.append(emplPositionTypeId);
		result.append(", rateTypeId: ");
		result.append(rateTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", payGradeId: ");
		result.append(payGradeId);
		result.append(", salaryStepSeqId: ");
		result.append(salaryStepSeqId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmplPositionTypeRateImpl
