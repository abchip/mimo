/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId <em>Period Type Id</em>}</li>
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
	 * Returns the value of the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Id</em>' reference.
	 * @see #setEmplPositionTypeId(EmplPositionType)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_EmplPositionTypeId()
	 * @model keys="emplPositionTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPositionType getEmplPositionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId <em>Empl Position Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type Id</em>' reference.
	 * @see #getEmplPositionTypeId()
	 * @generated
	 */
	void setEmplPositionTypeId(EmplPositionType value);

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='Describes when a rate amount will be valid. If null, valid immediately.'"
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
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Period Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type Id</em>' reference.
	 * @see #setPeriodTypeId(PeriodType)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_PeriodTypeId()
	 * @model keys="periodTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PeriodType getPeriodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId <em>Period Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type Id</em>' reference.
	 * @see #getPeriodTypeId()
	 * @generated
	 */
	void setPeriodTypeId(PeriodType value);

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * Returns the value of the '<em><b>Rate Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Currency Uom Id</em>' reference.
	 * @see #setRateCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_RateCurrencyUomId()
	 * @model keys="uomId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getRateCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Currency Uom Id</em>' reference.
	 * @see #getRateCurrencyUomId()
	 * @generated
	 */
	void setRateCurrencyUomId(Uom value);

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
	 * @model annotation="mimo-ent-slot help='Describes when a rate amount will be valid untl. If null, valid indefinitly.'"
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
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' reference.
	 * @see #setWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_WorkEffortId()
	 * @model keys="workEffortId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Type Id</em>' reference.
	 * @see #setRateTypeId(RateType)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getRateAmount_RateTypeId()
	 * @model keys="rateTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RateType getRateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateTypeId <em>Rate Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Type Id</em>' reference.
	 * @see #getRateTypeId()
	 * @generated
	 */
	void setRateTypeId(RateType value);

} // RateAmount
