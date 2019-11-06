/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period.impl;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.common.period.PeriodPackage;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Time Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodName <em>Period Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodNum <em>Period Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getParentPeriodId <em>Parent Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTimePeriodImpl extends BizEntityImpl implements CustomTimePeriod {
	/**
	 * The default value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TIME_PERIOD_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected String customTimePeriodId = CUSTOM_TIME_PERIOD_ID_EDEFAULT;
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
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean isClosed = IS_CLOSED_EDEFAULT;
	/**
	 * The default value of the '{@link #getPeriodName() <em>Period Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPeriodName() <em>Period Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodName()
	 * @generated
	 * @ordered
	 */
	protected String periodName = PERIOD_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPeriodNum() <em>Period Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodNum()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_NUM_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPeriodNum() <em>Period Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodNum()
	 * @generated
	 * @ordered
	 */
	protected long periodNum = PERIOD_NUM_EDEFAULT;
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
	 * The cached value of the '{@link #getParentPeriodId() <em>Parent Period Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPeriodId()
	 * @generated
	 * @ordered
	 */
	protected CustomTimePeriod parentPeriodId;
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
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTimePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeriodPackage.Literals.CUSTOM_TIME_PERIOD;
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
	public boolean isIsClosed() {
		return isClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClosed(boolean newIsClosed) {
		isClosed = newIsClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		organizationPartyId = newOrganizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeriodName() {
		return periodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodName(String newPeriodName) {
		periodName = newPeriodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPeriodNum() {
		return periodNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodNum(long newPeriodNum) {
		periodNum = newPeriodNum;
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
	public List<String> budgets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childCustomTimePeriods() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesForecastHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesForecasts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTimePeriod getParentPeriodId() {
		if (parentPeriodId != null && ((EObject)parentPeriodId).eIsProxy()) {
			InternalEObject oldParentPeriodId = (InternalEObject)parentPeriodId;
			parentPeriodId = (CustomTimePeriod)eResolveProxy(oldParentPeriodId);
			if (parentPeriodId != oldParentPeriodId) {
			}
		}
		return parentPeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTimePeriod basicGetParentPeriodId() {
		return parentPeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentPeriodId(CustomTimePeriod newParentPeriodId) {
		parentPeriodId = newParentPeriodId;
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
	public String getCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(String newCustomTimePeriodId) {
		customTimePeriodId = newCustomTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeriodPackage.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID:
				return getCustomTimePeriodId();
			case PeriodPackage.CUSTOM_TIME_PERIOD__FROM_DATE:
				return getFromDate();
			case PeriodPackage.CUSTOM_TIME_PERIOD__IS_CLOSED:
				return isIsClosed();
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NAME:
				return getPeriodName();
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NUM:
				return getPeriodNum();
			case PeriodPackage.CUSTOM_TIME_PERIOD__THRU_DATE:
				return getThruDate();
			case PeriodPackage.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID:
				if (resolve) return getParentPeriodId();
				return basicGetParentPeriodId();
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID:
				if (resolve) return getPeriodTypeId();
				return basicGetPeriodTypeId();
			case PeriodPackage.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
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
			case PeriodPackage.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((String)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__IS_CLOSED:
				setIsClosed((Boolean)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NAME:
				setPeriodName((String)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NUM:
				setPeriodNum((Long)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID:
				setParentPeriodId((CustomTimePeriod)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID:
				setPeriodTypeId((PeriodType)newValue);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
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
			case PeriodPackage.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId(CUSTOM_TIME_PERIOD_ID_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__IS_CLOSED:
				setIsClosed(IS_CLOSED_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NAME:
				setPeriodName(PERIOD_NAME_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NUM:
				setPeriodNum(PERIOD_NUM_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID:
				setParentPeriodId((CustomTimePeriod)null);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID:
				setPeriodTypeId((PeriodType)null);
				return;
			case PeriodPackage.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
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
			case PeriodPackage.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID:
				return CUSTOM_TIME_PERIOD_ID_EDEFAULT == null ? customTimePeriodId != null : !CUSTOM_TIME_PERIOD_ID_EDEFAULT.equals(customTimePeriodId);
			case PeriodPackage.CUSTOM_TIME_PERIOD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PeriodPackage.CUSTOM_TIME_PERIOD__IS_CLOSED:
				return isClosed != IS_CLOSED_EDEFAULT;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NAME:
				return PERIOD_NAME_EDEFAULT == null ? periodName != null : !PERIOD_NAME_EDEFAULT.equals(periodName);
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_NUM:
				return periodNum != PERIOD_NUM_EDEFAULT;
			case PeriodPackage.CUSTOM_TIME_PERIOD__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PeriodPackage.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID:
				return parentPeriodId != null;
			case PeriodPackage.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID:
				return periodTypeId != null;
			case PeriodPackage.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
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
		result.append(" (customTimePeriodId: ");
		result.append(customTimePeriodId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", isClosed: ");
		result.append(isClosed);
		result.append(", periodName: ");
		result.append(periodName);
		result.append(", periodNum: ");
		result.append(periodNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //CustomTimePeriodImpl
