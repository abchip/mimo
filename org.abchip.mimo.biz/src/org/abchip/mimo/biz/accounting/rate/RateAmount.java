/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateAmount <em>Rate Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount()
 * @model
 * @generated
 */
public interface RateAmount extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Empl Position Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Id</em>' attribute.
	 * @see #setEmplPositionTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_EmplPositionTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='EmplPositionType'"
	 * @generated
	 */
	String getEmplPositionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type Id</em>' attribute.
	 * @see #getEmplPositionTypeId()
	 * @generated
	 */
	void setEmplPositionTypeId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Period Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type Id</em>' attribute.
	 * @see #setPeriodTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_PeriodTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PeriodType'"
	 * @generated
	 */
	String getPeriodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type Id</em>' attribute.
	 * @see #getPeriodTypeId()
	 * @generated
	 */
	void setPeriodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Rate Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Amount</em>' attribute.
	 * @see #setRateAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_RateAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getRateAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateAmount <em>Rate Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Amount</em>' attribute.
	 * @see #getRateAmount()
	 * @generated
	 */
	void setRateAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Rate Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Currency Uom Id</em>' attribute.
	 * @see #setRateCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_RateCurrencyUomId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getRateCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Currency Uom Id</em>' attribute.
	 * @see #getRateCurrencyUomId()
	 * @generated
	 */
	void setRateCurrencyUomId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_WorkEffortId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Rate Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Type Id</em>' attribute.
	 * @see #setRateTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_RateTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='RateType'"
	 * @generated
	 */
	String getRateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateTypeId <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Type Id</em>' attribute.
	 * @see #getRateTypeId()
	 * @generated
	 */
	void setRateTypeId(String value);

} // RateAmount
