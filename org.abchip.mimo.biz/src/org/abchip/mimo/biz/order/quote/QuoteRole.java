/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteRole#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteRole#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteRole#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteRole#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteRole#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole()
 * @model
 * @generated
 */
public interface QuoteRole extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole_FromDate()
	 * @model annotation="mimo-ent-format type='date-time'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getFromDate <em>From Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' reference.
	 * @see #setQuoteId(Quote)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole_QuoteId()
	 * @model keys="quoteId"
	 * @generated
	 */
	Quote getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getQuoteId <em>Quote Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' reference.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(Quote value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

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
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteRole_ThruDate()
	 * @model annotation="mimo-ent-format type='date-time'"
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // QuoteRole
