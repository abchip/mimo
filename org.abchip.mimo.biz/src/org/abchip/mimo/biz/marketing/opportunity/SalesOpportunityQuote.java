/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.order.quote.Quote;

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
 * @model annotation="mimo-ent-frame title='Relates sales opportunities to their quotes.'"
 * @generated
 */
public interface SalesOpportunityQuote extends BizEntity {
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityQuote_QuoteId()
	 * @model keys="quoteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Quote getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getQuoteId <em>Quote Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' reference.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(Quote value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' reference.
	 * @see #setSalesOpportunityId(SalesOpportunity)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityQuote_SalesOpportunityId()
	 * @model keys="salesOpportunityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunityId <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' reference.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(SalesOpportunity value);

} // SalesOpportunityQuote
