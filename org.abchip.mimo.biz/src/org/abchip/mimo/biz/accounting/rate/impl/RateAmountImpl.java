/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.rate.RateAmount;
import org.abchip.mimo.biz.accounting.rate.RatePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateAmount <em>Rate Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RateAmountImpl extends BizEntityImpl implements RateAmount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getRateCurrencyUomId() <em>Rate Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRateCurrencyUomId() <em>Rate Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String rateCurrencyUomId = RATE_CURRENCY_UOM_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
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
	 * The default value of the '{@link #getRateAmount() <em>Rate Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RATE_AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRateAmount() <em>Rate Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rateAmount = RATE_AMOUNT_EDEFAULT;
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
	protected RateAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RatePackage.Literals.RATE_AMOUNT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID, oldPeriodTypeId, periodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRateAmount() {
		return rateAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateAmount(BigDecimal newRateAmount) {
		BigDecimal oldRateAmount = rateAmount;
		rateAmount = newRateAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__RATE_AMOUNT, oldRateAmount, rateAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateCurrencyUomId() {
		return rateCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateCurrencyUomId(String newRateCurrencyUomId) {
		String oldRateCurrencyUomId = rateCurrencyUomId;
		rateCurrencyUomId = newRateCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID, oldRateCurrencyUomId, rateCurrencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.RATE_AMOUNT__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				return getRateTypeId();
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				return getRateCurrencyUomId();
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
				return getPeriodTypeId();
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				return getPartyId();
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				return getWorkEffortId();
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				return getEmplPositionTypeId();
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				return getFromDate();
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				return getRateAmount();
			case RatePackage.RATE_AMOUNT__THRU_DATE:
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
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				setRateTypeId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				setRateCurrencyUomId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
				setPeriodTypeId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((String)newValue);
				return;
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				setRateAmount((BigDecimal)newValue);
				return;
			case RatePackage.RATE_AMOUNT__THRU_DATE:
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
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				setRateTypeId(RATE_TYPE_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				setRateCurrencyUomId(RATE_CURRENCY_UOM_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
				setPeriodTypeId(PERIOD_TYPE_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId(EMPL_POSITION_TYPE_ID_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				setRateAmount(RATE_AMOUNT_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__THRU_DATE:
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
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				return RATE_TYPE_ID_EDEFAULT == null ? rateTypeId != null : !RATE_TYPE_ID_EDEFAULT.equals(rateTypeId);
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				return RATE_CURRENCY_UOM_ID_EDEFAULT == null ? rateCurrencyUomId != null : !RATE_CURRENCY_UOM_ID_EDEFAULT.equals(rateCurrencyUomId);
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
				return PERIOD_TYPE_ID_EDEFAULT == null ? periodTypeId != null : !PERIOD_TYPE_ID_EDEFAULT.equals(periodTypeId);
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				return EMPL_POSITION_TYPE_ID_EDEFAULT == null ? emplPositionTypeId != null : !EMPL_POSITION_TYPE_ID_EDEFAULT.equals(emplPositionTypeId);
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				return RATE_AMOUNT_EDEFAULT == null ? rateAmount != null : !RATE_AMOUNT_EDEFAULT.equals(rateAmount);
			case RatePackage.RATE_AMOUNT__THRU_DATE:
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
		result.append(" (rateTypeId: ");
		result.append(rateTypeId);
		result.append(", rateCurrencyUomId: ");
		result.append(rateCurrencyUomId);
		result.append(", periodTypeId: ");
		result.append(periodTypeId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(", emplPositionTypeId: ");
		result.append(emplPositionTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", rateAmount: ");
		result.append(rateAmount);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //RateAmountImpl
