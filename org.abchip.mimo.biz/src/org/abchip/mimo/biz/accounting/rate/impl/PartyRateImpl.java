/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.rate.PartyRate;
import org.abchip.mimo.biz.accounting.rate.RatePackage;
import org.abchip.mimo.biz.accounting.rate.RateType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#isDefaultRate <em>Default Rate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#getPercentageUsed <em>Percentage Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl#getRateTypeId <em>Rate Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyRateImpl extends BizEntityImpl implements PartyRate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #isDefaultRate() <em>Default Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_RATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDefaultRate() <em>Default Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultRate()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultRate = DEFAULT_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPercentageUsed() <em>Percentage Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageUsed()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_USED_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getPercentageUsed() <em>Percentage Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageUsed()
	 * @generated
	 * @ordered
	 */
	protected double percentageUsed = PERCENTAGE_USED_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RatePackage.Literals.PARTY_RATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefaultRate() {
		return defaultRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultRate(boolean newDefaultRate) {
		boolean oldDefaultRate = defaultRate;
		defaultRate = newDefaultRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__DEFAULT_RATE, oldDefaultRate, defaultRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPercentageUsed() {
		return percentageUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageUsed(double newPercentageUsed) {
		double oldPercentageUsed = percentageUsed;
		percentageUsed = newPercentageUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__PERCENTAGE_USED, oldPercentageUsed, percentageUsed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__THRU_DATE, oldThruDate, thruDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RatePackage.PARTY_RATE__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RatePackage.PARTY_RATE__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RatePackage.PARTY_RATE__PARTY_ID:
				return getPartyId();
			case RatePackage.PARTY_RATE__FROM_DATE:
				return getFromDate();
			case RatePackage.PARTY_RATE__DEFAULT_RATE:
				return isDefaultRate();
			case RatePackage.PARTY_RATE__PERCENTAGE_USED:
				return getPercentageUsed();
			case RatePackage.PARTY_RATE__THRU_DATE:
				return getThruDate();
			case RatePackage.PARTY_RATE__RATE_TYPE_ID:
				if (resolve) return getRateTypeId();
				return basicGetRateTypeId();
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
			case RatePackage.PARTY_RATE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case RatePackage.PARTY_RATE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case RatePackage.PARTY_RATE__DEFAULT_RATE:
				setDefaultRate((Boolean)newValue);
				return;
			case RatePackage.PARTY_RATE__PERCENTAGE_USED:
				setPercentageUsed((Double)newValue);
				return;
			case RatePackage.PARTY_RATE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case RatePackage.PARTY_RATE__RATE_TYPE_ID:
				setRateTypeId((RateType)newValue);
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
			case RatePackage.PARTY_RATE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case RatePackage.PARTY_RATE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case RatePackage.PARTY_RATE__DEFAULT_RATE:
				setDefaultRate(DEFAULT_RATE_EDEFAULT);
				return;
			case RatePackage.PARTY_RATE__PERCENTAGE_USED:
				setPercentageUsed(PERCENTAGE_USED_EDEFAULT);
				return;
			case RatePackage.PARTY_RATE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case RatePackage.PARTY_RATE__RATE_TYPE_ID:
				setRateTypeId((RateType)null);
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
			case RatePackage.PARTY_RATE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case RatePackage.PARTY_RATE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case RatePackage.PARTY_RATE__DEFAULT_RATE:
				return defaultRate != DEFAULT_RATE_EDEFAULT;
			case RatePackage.PARTY_RATE__PERCENTAGE_USED:
				return percentageUsed != PERCENTAGE_USED_EDEFAULT;
			case RatePackage.PARTY_RATE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case RatePackage.PARTY_RATE__RATE_TYPE_ID:
				return rateTypeId != null;
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", defaultRate: ");
		result.append(defaultRate);
		result.append(", percentageUsed: ");
		result.append(percentageUsed);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyRateImpl
