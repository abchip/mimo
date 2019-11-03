/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getQuoteId <em>Quote Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityQuote()
 * @model
 * @generated
 */
public interface SalesOpportunityQuote extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' attribute.
	 * @see #setQuoteId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityQuote_QuoteId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Quote'"
	 * @generated
	 */
	String getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getQuoteId <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' attribute.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #setSalesOpportunityId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityQuote_SalesOpportunityId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

} // SalesOpportunityQuote
