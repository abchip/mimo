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
import org.abchip.mimo.biz.humanres.employment.SalaryStep;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getSalaryStepSeqId <em>Salary Step Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getPayGradeId <em>Pay Grade Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.SalaryStepImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalaryStepImpl extends BizEntityImpl implements SalaryStep {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected Date dateModified = DATE_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

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
	protected SalaryStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.SALARY_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateModified() {
		return dateModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateModified(Date newDateModified) {
		Date oldDateModified = dateModified;
		dateModified = newDateModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__DATE_MODIFIED, oldDateModified, dateModified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__PAY_GRADE_ID, oldPayGradeId, payGradeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__SALARY_STEP_SEQ_ID, oldSalaryStepSeqId, salaryStepSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.SALARY_STEP__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.SALARY_STEP__SALARY_STEP_SEQ_ID:
				return getSalaryStepSeqId();
			case EmploymentPackage.SALARY_STEP__PAY_GRADE_ID:
				return getPayGradeId();
			case EmploymentPackage.SALARY_STEP__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.SALARY_STEP__AMOUNT:
				return getAmount();
			case EmploymentPackage.SALARY_STEP__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case EmploymentPackage.SALARY_STEP__DATE_MODIFIED:
				return getDateModified();
			case EmploymentPackage.SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case EmploymentPackage.SALARY_STEP__THRU_DATE:
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
			case EmploymentPackage.SALARY_STEP__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId((String)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__PAY_GRADE_ID:
				setPayGradeId((String)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__DATE_MODIFIED:
				setDateModified((Date)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case EmploymentPackage.SALARY_STEP__THRU_DATE:
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
			case EmploymentPackage.SALARY_STEP__SALARY_STEP_SEQ_ID:
				setSalaryStepSeqId(SALARY_STEP_SEQ_ID_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__PAY_GRADE_ID:
				setPayGradeId(PAY_GRADE_ID_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__DATE_MODIFIED:
				setDateModified(DATE_MODIFIED_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case EmploymentPackage.SALARY_STEP__THRU_DATE:
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
			case EmploymentPackage.SALARY_STEP__SALARY_STEP_SEQ_ID:
				return SALARY_STEP_SEQ_ID_EDEFAULT == null ? salaryStepSeqId != null : !SALARY_STEP_SEQ_ID_EDEFAULT.equals(salaryStepSeqId);
			case EmploymentPackage.SALARY_STEP__PAY_GRADE_ID:
				return PAY_GRADE_ID_EDEFAULT == null ? payGradeId != null : !PAY_GRADE_ID_EDEFAULT.equals(payGradeId);
			case EmploymentPackage.SALARY_STEP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.SALARY_STEP__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case EmploymentPackage.SALARY_STEP__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case EmploymentPackage.SALARY_STEP__DATE_MODIFIED:
				return DATE_MODIFIED_EDEFAULT == null ? dateModified != null : !DATE_MODIFIED_EDEFAULT.equals(dateModified);
			case EmploymentPackage.SALARY_STEP__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case EmploymentPackage.SALARY_STEP__THRU_DATE:
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
		result.append(" (salaryStepSeqId: ");
		result.append(salaryStepSeqId);
		result.append(", payGradeId: ");
		result.append(payGradeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", amount: ");
		result.append(amount);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", dateModified: ");
		result.append(dateModified);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //SalaryStepImpl
