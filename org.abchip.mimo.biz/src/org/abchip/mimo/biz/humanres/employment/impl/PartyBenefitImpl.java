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
import org.abchip.mimo.biz.humanres.employment.PartyBenefit;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Benefit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getBenefitTypeId <em>Benefit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getActualEmployerPaidPercent <em>Actual Employer Paid Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.PartyBenefitImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyBenefitImpl extends BizEntityImpl implements PartyBenefit {
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
	 * The default value of the '{@link #getBenefitTypeId() <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BENEFIT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBenefitTypeId() <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitTypeId()
	 * @generated
	 * @ordered
	 */
	protected String benefitTypeId = BENEFIT_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getActualEmployerPaidPercent() <em>Actual Employer Paid Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualEmployerPaidPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_EMPLOYER_PAID_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualEmployerPaidPercent() <em>Actual Employer Paid Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualEmployerPaidPercent()
	 * @generated
	 * @ordered
	 */
	protected double actualEmployerPaidPercent = ACTUAL_EMPLOYER_PAID_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTime() <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected static final long AVAILABLE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAvailableTime() <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected long availableTime = AVAILABLE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

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
	protected PartyBenefitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.PARTY_BENEFIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getActualEmployerPaidPercent() {
		return actualEmployerPaidPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualEmployerPaidPercent(double newActualEmployerPaidPercent) {
		double oldActualEmployerPaidPercent = actualEmployerPaidPercent;
		actualEmployerPaidPercent = newActualEmployerPaidPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT, oldActualEmployerPaidPercent, actualEmployerPaidPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAvailableTime() {
		return availableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		long oldAvailableTime = availableTime;
		availableTime = newAvailableTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__AVAILABLE_TIME, oldAvailableTime, availableTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBenefitTypeId() {
		return benefitTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefitTypeId(String newBenefitTypeId) {
		String oldBenefitTypeId = benefitTypeId;
		benefitTypeId = newBenefitTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__BENEFIT_TYPE_ID, oldBenefitTypeId, benefitTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__COST, oldCost, cost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__PERIOD_TYPE_ID, oldPeriodTypeId, periodTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.PARTY_BENEFIT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_FROM:
				return getRoleTypeIdFrom();
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_FROM:
				return getPartyIdFrom();
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_TO:
				return getPartyIdTo();
			case EmploymentPackage.PARTY_BENEFIT__BENEFIT_TYPE_ID:
				return getBenefitTypeId();
			case EmploymentPackage.PARTY_BENEFIT__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT:
				return getActualEmployerPaidPercent();
			case EmploymentPackage.PARTY_BENEFIT__AVAILABLE_TIME:
				return getAvailableTime();
			case EmploymentPackage.PARTY_BENEFIT__COST:
				return getCost();
			case EmploymentPackage.PARTY_BENEFIT__PERIOD_TYPE_ID:
				return getPeriodTypeId();
			case EmploymentPackage.PARTY_BENEFIT__THRU_DATE:
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
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__BENEFIT_TYPE_ID:
				setBenefitTypeId((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT:
				setActualEmployerPaidPercent((Double)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__AVAILABLE_TIME:
				setAvailableTime((Long)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__COST:
				setCost((BigDecimal)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PERIOD_TYPE_ID:
				setPeriodTypeId((String)newValue);
				return;
			case EmploymentPackage.PARTY_BENEFIT__THRU_DATE:
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
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom(ROLE_TYPE_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__BENEFIT_TYPE_ID:
				setBenefitTypeId(BENEFIT_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT:
				setActualEmployerPaidPercent(ACTUAL_EMPLOYER_PAID_PERCENT_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__AVAILABLE_TIME:
				setAvailableTime(AVAILABLE_TIME_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__COST:
				setCost(COST_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__PERIOD_TYPE_ID:
				setPeriodTypeId(PERIOD_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.PARTY_BENEFIT__THRU_DATE:
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
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_FROM:
				return ROLE_TYPE_ID_FROM_EDEFAULT == null ? roleTypeIdFrom != null : !ROLE_TYPE_ID_FROM_EDEFAULT.equals(roleTypeIdFrom);
			case EmploymentPackage.PARTY_BENEFIT__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case EmploymentPackage.PARTY_BENEFIT__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case EmploymentPackage.PARTY_BENEFIT__BENEFIT_TYPE_ID:
				return BENEFIT_TYPE_ID_EDEFAULT == null ? benefitTypeId != null : !BENEFIT_TYPE_ID_EDEFAULT.equals(benefitTypeId);
			case EmploymentPackage.PARTY_BENEFIT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.PARTY_BENEFIT__ACTUAL_EMPLOYER_PAID_PERCENT:
				return actualEmployerPaidPercent != ACTUAL_EMPLOYER_PAID_PERCENT_EDEFAULT;
			case EmploymentPackage.PARTY_BENEFIT__AVAILABLE_TIME:
				return availableTime != AVAILABLE_TIME_EDEFAULT;
			case EmploymentPackage.PARTY_BENEFIT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case EmploymentPackage.PARTY_BENEFIT__PERIOD_TYPE_ID:
				return PERIOD_TYPE_ID_EDEFAULT == null ? periodTypeId != null : !PERIOD_TYPE_ID_EDEFAULT.equals(periodTypeId);
			case EmploymentPackage.PARTY_BENEFIT__THRU_DATE:
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
		result.append(", benefitTypeId: ");
		result.append(benefitTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", actualEmployerPaidPercent: ");
		result.append(actualEmployerPaidPercent);
		result.append(", availableTime: ");
		result.append(availableTime);
		result.append(", cost: ");
		result.append(cost);
		result.append(", periodTypeId: ");
		result.append(periodTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyBenefitImpl
