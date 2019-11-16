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
import org.abchip.mimo.biz.accounting.rate.RateType;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateAmount <em>Rate Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
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
	 * The cached value of the '{@link #getRateTypeId() <em>Rate Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected RateType rateTypeId;
	/**
	 * The cached value of the '{@link #getRateCurrencyUomId() <em>Rate Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom rateCurrencyUomId;
	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;
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
	 * The cached value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplPositionType emplPositionTypeId;
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
	public EmplPositionType getEmplPositionTypeId() {
		if (emplPositionTypeId != null && ((EObject)emplPositionTypeId).eIsProxy()) {
			InternalEObject oldEmplPositionTypeId = (InternalEObject)emplPositionTypeId;
			emplPositionTypeId = (EmplPositionType)eResolveProxy(oldEmplPositionTypeId);
			if (emplPositionTypeId != oldEmplPositionTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
			}
		}
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPositionType basicGetEmplPositionTypeId() {
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(EmplPositionType newEmplPositionTypeId) {
		EmplPositionType oldEmplPositionTypeId = emplPositionTypeId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__PARTY_ID, oldPartyId, partyId));
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
		Party oldPartyId = partyId;
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
	public PeriodType getPeriodTypeId() {
		if (periodTypeId != null && ((EObject)periodTypeId).eIsProxy()) {
			InternalEObject oldPeriodTypeId = (InternalEObject)periodTypeId;
			periodTypeId = (PeriodType)eResolveProxy(oldPeriodTypeId);
			if (periodTypeId != oldPeriodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID, oldPeriodTypeId, periodTypeId));
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
		PeriodType oldPeriodTypeId = periodTypeId;
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
	public Uom getRateCurrencyUomId() {
		if (rateCurrencyUomId != null && ((EObject)rateCurrencyUomId).eIsProxy()) {
			InternalEObject oldRateCurrencyUomId = (InternalEObject)rateCurrencyUomId;
			rateCurrencyUomId = (Uom)eResolveProxy(oldRateCurrencyUomId);
			if (rateCurrencyUomId != oldRateCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID, oldRateCurrencyUomId, rateCurrencyUomId));
			}
		}
		return rateCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetRateCurrencyUomId() {
		return rateCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateCurrencyUomId(Uom newRateCurrencyUomId) {
		Uom oldRateCurrencyUomId = rateCurrencyUomId;
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		WorkEffort oldWorkEffortId = workEffortId;
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
	public RateType getRateTypeId() {
		if (rateTypeId != null && ((EObject)rateTypeId).eIsProxy()) {
			InternalEObject oldRateTypeId = (InternalEObject)rateTypeId;
			rateTypeId = (RateType)eResolveProxy(oldRateTypeId);
			if (rateTypeId != oldRateTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.RATE_AMOUNT__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
			}
		}
		return rateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateType basicGetRateTypeId() {
		return rateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateTypeId(RateType newRateTypeId) {
		RateType oldRateTypeId = rateTypeId;
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
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				return getFromDate();
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				return getRateAmount();
			case RatePackage.RATE_AMOUNT__THRU_DATE:
				return getThruDate();
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				if (resolve) return getRateTypeId();
				return basicGetRateTypeId();
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				if (resolve) return getRateCurrencyUomId();
				return basicGetRateCurrencyUomId();
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				if (resolve) return getEmplPositionTypeId();
				return basicGetEmplPositionTypeId();
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
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
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				setRateAmount((BigDecimal)newValue);
				return;
			case RatePackage.RATE_AMOUNT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				setRateTypeId((RateType)newValue);
				return;
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				setRateCurrencyUomId((Uom)newValue);
				return;
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)newValue);
				return;
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
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
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				setRateAmount(RATE_AMOUNT_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				setRateTypeId((RateType)null);
				return;
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				setRateCurrencyUomId((Uom)null);
				return;
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)null);
				return;
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
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
			case RatePackage.RATE_AMOUNT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case RatePackage.RATE_AMOUNT__RATE_AMOUNT:
				return RATE_AMOUNT_EDEFAULT == null ? rateAmount != null : !RATE_AMOUNT_EDEFAULT.equals(rateAmount);
			case RatePackage.RATE_AMOUNT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case RatePackage.RATE_AMOUNT__RATE_TYPE_ID:
				return rateTypeId != null;
			case RatePackage.RATE_AMOUNT__RATE_CURRENCY_UOM_ID:
				return rateCurrencyUomId != null;
			case RatePackage.RATE_AMOUNT__WORK_EFFORT_ID:
				return workEffortId != null;
			case RatePackage.RATE_AMOUNT__PARTY_ID:
				return partyId != null;
			case RatePackage.RATE_AMOUNT__EMPL_POSITION_TYPE_ID:
				return emplPositionTypeId != null;
			case RatePackage.RATE_AMOUNT__PERIOD_TYPE_ID:
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", rateAmount: ");
		result.append(rateAmount);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //RateAmountImpl
