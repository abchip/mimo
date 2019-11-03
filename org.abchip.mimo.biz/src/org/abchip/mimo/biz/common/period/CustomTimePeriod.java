/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Time Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getParentPeriodId <em>Parent Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodName <em>Period Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodNum <em>Period Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod()
 * @model
 * @generated
 */
public interface CustomTimePeriod extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(boolean)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_IsClosed()
	 * @model
	 * @generated
	 */
	boolean isIsClosed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#isIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #isIsClosed()
	 * @generated
	 */
	void setIsClosed(boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' attribute.
	 * @see #setOrganizationPartyId(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_OrganizationPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getOrganizationPartyId <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' attribute.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Period Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Name</em>' attribute.
	 * @see #setPeriodName(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_PeriodName()
	 * @model
	 * @generated
	 */
	String getPeriodName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodName <em>Period Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Name</em>' attribute.
	 * @see #getPeriodName()
	 * @generated
	 */
	void setPeriodName(String value);

	/**
	 * Returns the value of the '<em><b>Period Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Num</em>' attribute.
	 * @see #setPeriodNum(long)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_PeriodNum()
	 * @model
	 * @generated
	 */
	long getPeriodNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodNum <em>Period Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Num</em>' attribute.
	 * @see #getPeriodNum()
	 * @generated
	 */
	void setPeriodNum(long value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Budget' route='customTimePeriodId'"
	 * @generated
	 */
	List<String> budgets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustomTimePeriod' route='parentPeriodId'"
	 * @generated
	 */
	List<String> childCustomTimePeriods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastHistory' route='customTimePeriodId'"
	 * @generated
	 */
	List<String> salesForecastHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecast' route='customTimePeriodId'"
	 * @generated
	 */
	List<String> salesForecasts();

	/**
	 * Returns the value of the '<em><b>Parent Period Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Period Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Period Id</em>' attribute.
	 * @see #setParentPeriodId(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_ParentPeriodId()
	 * @model annotation="mimo-ent-domain frame='CustomTimePeriod'"
	 * @generated
	 */
	String getParentPeriodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getParentPeriodId <em>Parent Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Period Id</em>' attribute.
	 * @see #getParentPeriodId()
	 * @generated
	 */
	void setParentPeriodId(String value);

	/**
	 * Returns the value of the '<em><b>Period Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type Id</em>' attribute.
	 * @see #setPeriodTypeId(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_PeriodTypeId()
	 * @model annotation="mimo-ent-domain frame='PeriodType'"
	 * @generated
	 */
	String getPeriodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodTypeId <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type Id</em>' attribute.
	 * @see #getPeriodTypeId()
	 * @generated
	 */
	void setPeriodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Time Period Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #setCustomTimePeriodId(String)
	 * @see org.abchip.mimo.biz.common.period.PeriodPackage#getCustomTimePeriod_CustomTimePeriodId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustomTimePeriodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getCustomTimePeriodId <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #getCustomTimePeriodId()
	 * @generated
	 */
	void setCustomTimePeriodId(String value);

} // CustomTimePeriod
