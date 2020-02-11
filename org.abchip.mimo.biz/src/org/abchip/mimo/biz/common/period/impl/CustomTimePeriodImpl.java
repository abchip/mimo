/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period.impl;

import java.util.Date;
import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.common.period.PeriodPackage;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getParentPeriodId <em>Parent Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodName <em>Period Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodNum <em>Period Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTimePeriodImpl extends BizEntityImpl implements CustomTimePeriod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return (Date)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsClosed() {
		return (Boolean)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__IS_CLOSED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClosed(boolean newIsClosed) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__IS_CLOSED, newIsClosed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		return (Party)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID, newOrganizationPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeriodName() {
		return (String)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodName(String newPeriodName) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_NAME, newPeriodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPeriodNum() {
		return (Long)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodNum(long newPeriodNum) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_NUM, newPeriodNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTimePeriod getParentPeriodId() {
		return (CustomTimePeriod)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentPeriodId(CustomTimePeriod newParentPeriodId) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID, newParentPeriodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PeriodType getPeriodTypeId() {
		return (PeriodType)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodTypeId(PeriodType newPeriodTypeId) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID, newPeriodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomTimePeriodId() {
		return (String)eGet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(String newCustomTimePeriodId) {
		eSet(PeriodPackage.Literals.CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID, newCustomTimePeriodId);
	}

} //CustomTimePeriodImpl
