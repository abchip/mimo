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

import org.abchip.mimo.biz.accounting.payment.DeductionType;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.humanres.employment.PayrollPreference;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payroll Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getPayrollPreferenceSeqId <em>Payroll Preference Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getFlatAmount <em>Flat Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getRoutingNumber <em>Routing Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getDeductionTypeId <em>Deduction Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PayrollPreferenceImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayrollPreferenceImpl extends BizEntityImpl implements PayrollPreference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayrollPreferenceSeqId() <em>Payroll Preference Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayrollPreferenceSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYROLL_PREFERENCE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayrollPreferenceSeqId() <em>Payroll Preference Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayrollPreferenceSeqId()
	 * @generated
	 * @ordered
	 */
	protected String payrollPreferenceSeqId = PAYROLL_PREFERENCE_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlatAmount() <em>Flat Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FLAT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlatAmount() <em>Flat Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal flatAmount = FLAT_AMOUNT_EDEFAULT;

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
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected double percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingNumber() <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingNumber() <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingNumber()
	 * @generated
	 * @ordered
	 */
	protected String routingNumber = ROUTING_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getDeductionTypeId() <em>Deduction Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionTypeId()
	 * @generated
	 * @ordered
	 */
	protected DeductionType deductionTypeId;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethodType paymentMethodTypeId;

	/**
	 * The cached value of the '{@link #getPeriodTypeId() <em>Period Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PeriodType periodTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayrollPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.PAYROLL_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBankName() {
		return bankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankName(String newBankName) {
		bankName = newBankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeductionType getDeductionTypeId() {
		if (deductionTypeId != null && ((EObject)deductionTypeId).eIsProxy()) {
			InternalEObject oldDeductionTypeId = (InternalEObject)deductionTypeId;
			deductionTypeId = (DeductionType)eResolveProxy(oldDeductionTypeId);
			if (deductionTypeId != oldDeductionTypeId) {
			}
		}
		return deductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeductionType basicGetDeductionTypeId() {
		return deductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeductionTypeId(DeductionType newDeductionTypeId) {
		deductionTypeId = newDeductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFlatAmount() {
		return flatAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatAmount(BigDecimal newFlatAmount) {
		flatAmount = newFlatAmount;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
			}
		}
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethodType basicGetPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayrollPreferenceSeqId() {
		return payrollPreferenceSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayrollPreferenceSeqId(String newPayrollPreferenceSeqId) {
		payrollPreferenceSeqId = newPayrollPreferenceSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentage(double newPercentage) {
		percentage = newPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodType getPeriodTypeId() {
		if (periodTypeId != null && ((EObject)periodTypeId).eIsProxy()) {
			InternalEObject oldPeriodTypeId = (InternalEObject)periodTypeId;
			periodTypeId = (PeriodType)eResolveProxy(oldPeriodTypeId);
			if (periodTypeId != oldPeriodTypeId) {
			}
		}
		return periodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodType basicGetPeriodTypeId() {
		return periodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodTypeId(PeriodType newPeriodTypeId) {
		periodTypeId = newPeriodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutingNumber() {
		return routingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingNumber(String newRoutingNumber) {
		routingNumber = newRoutingNumber;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.PAYROLL_PREFERENCE__ROLE_TYPE_ID:
				return getRoleTypeId();
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID:
				return getPayrollPreferenceSeqId();
			case EmploymentPackage.PAYROLL_PREFERENCE__ACCOUNT_NUMBER:
				return getAccountNumber();
			case EmploymentPackage.PAYROLL_PREFERENCE__BANK_NAME:
				return getBankName();
			case EmploymentPackage.PAYROLL_PREFERENCE__FLAT_AMOUNT:
				return getFlatAmount();
			case EmploymentPackage.PAYROLL_PREFERENCE__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.PAYROLL_PREFERENCE__PERCENTAGE:
				return getPercentage();
			case EmploymentPackage.PAYROLL_PREFERENCE__ROUTING_NUMBER:
				return getRoutingNumber();
			case EmploymentPackage.PAYROLL_PREFERENCE__THRU_DATE:
				return getThruDate();
			case EmploymentPackage.PAYROLL_PREFERENCE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case EmploymentPackage.PAYROLL_PREFERENCE__DEDUCTION_TYPE_ID:
				if (resolve) return getDeductionTypeId();
				return basicGetDeductionTypeId();
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case EmploymentPackage.PAYROLL_PREFERENCE__PERIOD_TYPE_ID:
				if (resolve) return getPeriodTypeId();
				return basicGetPeriodTypeId();
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
			case EmploymentPackage.PAYROLL_PREFERENCE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID:
				setPayrollPreferenceSeqId((String)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__BANK_NAME:
				setBankName((String)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__FLAT_AMOUNT:
				setFlatAmount((BigDecimal)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PERCENTAGE:
				setPercentage((Double)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__ROUTING_NUMBER:
				setRoutingNumber((String)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__DEDUCTION_TYPE_ID:
				setDeductionTypeId((DeductionType)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PERIOD_TYPE_ID:
				setPeriodTypeId((PeriodType)newValue);
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
			case EmploymentPackage.PAYROLL_PREFERENCE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID:
				setPayrollPreferenceSeqId(PAYROLL_PREFERENCE_SEQ_ID_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__ACCOUNT_NUMBER:
				setAccountNumber(ACCOUNT_NUMBER_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__BANK_NAME:
				setBankName(BANK_NAME_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__FLAT_AMOUNT:
				setFlatAmount(FLAT_AMOUNT_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__ROUTING_NUMBER:
				setRoutingNumber(ROUTING_NUMBER_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__DEDUCTION_TYPE_ID:
				setDeductionTypeId((DeductionType)null);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case EmploymentPackage.PAYROLL_PREFERENCE__PERIOD_TYPE_ID:
				setPeriodTypeId((PeriodType)null);
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
			case EmploymentPackage.PAYROLL_PREFERENCE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYROLL_PREFERENCE_SEQ_ID:
				return PAYROLL_PREFERENCE_SEQ_ID_EDEFAULT == null ? payrollPreferenceSeqId != null : !PAYROLL_PREFERENCE_SEQ_ID_EDEFAULT.equals(payrollPreferenceSeqId);
			case EmploymentPackage.PAYROLL_PREFERENCE__ACCOUNT_NUMBER:
				return ACCOUNT_NUMBER_EDEFAULT == null ? accountNumber != null : !ACCOUNT_NUMBER_EDEFAULT.equals(accountNumber);
			case EmploymentPackage.PAYROLL_PREFERENCE__BANK_NAME:
				return BANK_NAME_EDEFAULT == null ? bankName != null : !BANK_NAME_EDEFAULT.equals(bankName);
			case EmploymentPackage.PAYROLL_PREFERENCE__FLAT_AMOUNT:
				return FLAT_AMOUNT_EDEFAULT == null ? flatAmount != null : !FLAT_AMOUNT_EDEFAULT.equals(flatAmount);
			case EmploymentPackage.PAYROLL_PREFERENCE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.PAYROLL_PREFERENCE__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
			case EmploymentPackage.PAYROLL_PREFERENCE__ROUTING_NUMBER:
				return ROUTING_NUMBER_EDEFAULT == null ? routingNumber != null : !ROUTING_NUMBER_EDEFAULT.equals(routingNumber);
			case EmploymentPackage.PAYROLL_PREFERENCE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case EmploymentPackage.PAYROLL_PREFERENCE__PARTY_ID:
				return partyId != null;
			case EmploymentPackage.PAYROLL_PREFERENCE__DEDUCTION_TYPE_ID:
				return deductionTypeId != null;
			case EmploymentPackage.PAYROLL_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case EmploymentPackage.PAYROLL_PREFERENCE__PERIOD_TYPE_ID:
				return periodTypeId != null;
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
		result.append(" (roleTypeId: ");
		result.append(roleTypeId);
		result.append(", payrollPreferenceSeqId: ");
		result.append(payrollPreferenceSeqId);
		result.append(", accountNumber: ");
		result.append(accountNumber);
		result.append(", bankName: ");
		result.append(bankName);
		result.append(", flatAmount: ");
		result.append(flatAmount);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", percentage: ");
		result.append(percentage);
		result.append(", routingNumber: ");
		result.append(routingNumber);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PayrollPreferenceImpl
