/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#isDefaultRate <em>Default Rate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPercentageUsed <em>Percentage Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getRateTypeId <em>Rate Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate()
 * @model
 * @generated
 */
public interface PartyRate extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Rate</em>' attribute.
	 * @see #setDefaultRate(boolean)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_DefaultRate()
	 * @model
	 * @generated
	 */
	boolean isDefaultRate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#isDefaultRate <em>Default Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Rate</em>' attribute.
	 * @see #isDefaultRate()
	 * @generated
	 */
	void setDefaultRate(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Percentage Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Used</em>' attribute.
	 * @see #setPercentageUsed(double)
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_PercentageUsed()
	 * @model
	 * @generated
	 */
	double getPercentageUsed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPercentageUsed <em>Percentage Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Used</em>' attribute.
	 * @see #getPercentageUsed()
	 * @generated
	 */
	void setPercentageUsed(double value);

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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.accounting.rate.RatePackage#getPartyRate_RateTypeId()
	 * @model keys="rateTypeId"
	 * @generated
	 */
	RateType getRateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getRateTypeId <em>Rate Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Type Id</em>' reference.
	 * @see #getRateTypeId()
	 * @generated
	 */
	void setRateTypeId(RateType value);

} // PartyRate
