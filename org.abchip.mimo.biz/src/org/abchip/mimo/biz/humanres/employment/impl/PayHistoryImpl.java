/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.humanres.employment.PayHistory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pay History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getPayGradeId <em>Pay Grade Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getSalaryStepSeqId <em>Salary Step Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayHistoryImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayHistoryImpl extends BizEntityImpl implements PayHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdFrom = ROLE_TYPE_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdTo = ROLE_TYPE_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;

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
	 * The default value of the '{@link #getPeriodTypeId() <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriodTypeId() <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String periodTypeId = PERIOD_TYPE_ID_EDEFAULT;

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
	protected PayHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.PAY_HISTORY;
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
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__PAY_GRADE_ID, oldPayGradeId, payGradeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeriodTypeId() {
		return periodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodTypeId(String newPeriodTypeId) {
		String oldPeriodTypeId = periodTypeId;
		periodTypeId = newPeriodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__PERIOD_TYPE_ID, oldPeriodTypeId, periodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(String newRoleTypeIdFrom) {
		String oldRoleTypeIdFrom = roleTypeIdFrom;
		roleTypeIdFrom = newRoleTypeIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(String newRoleTypeIdTo) {
		String oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__SALARY_STEP_SEQ_ID, oldSalaryStepSeqId, salaryStepSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PAY_HISTORY__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_FROM:
				return getRoleTypeIdFrom();
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_FROM:
				return getPartyIdFrom();
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_TO:
				return getPartyIdTo();
			case EmploymentPackage.PAY_HISTORY__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.PAY_HISTORY__AMOUNT:
				return getAmount();
			case EmploymentPackage.PAY_HISTORY__COMMENTS:
				return getComments();
			case EmploymentPackage.PAY_HISTORY__PAY_GRADE_ID:
				return getPayGradeId();
			case EmploymentPackage.PAY_HISTORY__PERIOD_TYPE_ID:
				return getPeriodTypeId();
			case EmploymentPackage.PAY_HISTORY__SALARY_STEP_SEQ_ID:
				return getSalaryStepSeqId();
			case EmploymentPackage.PAY_HISTORY__THRU_DATE:
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
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__COMMENTS:
				setComments((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__PAY_GRADE_ID:
				setPayGradeId((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__PERIOD_TYPE_ID:
				setPeriodTypeId((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId((String)newValue);
				return;
			case EmploymentPackage.PAY_HISTORY__THRU_DATE:
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
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom(ROLE_TYPE_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__PAY_GRADE_ID:
				setPayGradeId(PAY_GRADE_ID_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__PERIOD_TYPE_ID:
				setPeriodTypeId(PERIOD_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId(SALARY_STEP_SEQ_ID_EDEFAULT);
				return;
			case EmploymentPackage.PAY_HISTORY__THRU_DATE:
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
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_FROM:
				return ROLE_TYPE_ID_FROM_EDEFAULT == null ? roleTypeIdFrom != null : !ROLE_TYPE_ID_FROM_EDEFAULT.equals(roleTypeIdFrom);
			case EmploymentPackage.PAY_HISTORY__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case EmploymentPackage.PAY_HISTORY__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case EmploymentPackage.PAY_HISTORY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.PAY_HISTORY__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case EmploymentPackage.PAY_HISTORY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case EmploymentPackage.PAY_HISTORY__PAY_GRADE_ID:
				return PAY_GRADE_ID_EDEFAULT == null ? payGradeId != null : !PAY_GRADE_ID_EDEFAULT.equals(payGradeId);
			case EmploymentPackage.PAY_HISTORY__PERIOD_TYPE_ID:
				return PERIOD_TYPE_ID_EDEFAULT == null ? periodTypeId != null : !PERIOD_TYPE_ID_EDEFAULT.equals(periodTypeId);
			case EmploymentPackage.PAY_HISTORY__SALARY_STEP_SEQ_ID:
				return SALARY_STEP_SEQ_ID_EDEFAULT == null ? salaryStepSeqId != null : !SALARY_STEP_SEQ_ID_EDEFAULT.equals(salaryStepSeqId);
			case EmploymentPackage.PAY_HISTORY__THRU_DATE:
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
		result.append(" (roleTypeIdFrom: ");
		result.append(roleTypeIdFrom);
		result.append(", roleTypeIdTo: ");
		result.append(roleTypeIdTo);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", amount: ");
		result.append(amount);
		result.append(", comments: ");
		result.append(comments);
		result.append(", payGradeId: ");
		result.append(payGradeId);
		result.append(", periodTypeId: ");
		result.append(periodTypeId);
		result.append(", salaryStepSeqId: ");
		result.append(salaryStepSeqId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PayHistoryImpl
