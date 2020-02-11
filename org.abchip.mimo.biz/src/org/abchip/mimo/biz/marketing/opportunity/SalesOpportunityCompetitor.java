/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Competitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId <em>Competitor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId <em>Position Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getStrengths <em>Strengths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor()
 * @model annotation="mimo-ent-frame title='Sales opportunity competitors record'"
 * @generated
 */
public interface SalesOpportunityCompetitor extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Competitor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Competitor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competitor Party Id</em>' attribute.
	 * @see #setCompetitorPartyId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor_CompetitorPartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCompetitorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId <em>Competitor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competitor Party Id</em>' attribute.
	 * @see #getCompetitorPartyId()
	 * @generated
	 */
	void setCompetitorPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Position Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Enum Id</em>' attribute.
	 * @see #setPositionEnumId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor_PositionEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPositionEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId <em>Position Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Enum Id</em>' attribute.
	 * @see #getPositionEnumId()
	 * @generated
	 */
	void setPositionEnumId(String value);

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor_SalesOpportunityId()
	 * @model keys="salesOpportunityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunityId <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' reference.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(SalesOpportunity value);

	/**
	 * Returns the value of the '<em><b>Strengths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strengths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strengths</em>' attribute.
	 * @see #setStrengths(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor_Strengths()
	 * @model
	 * @generated
	 */
	String getStrengths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getStrengths <em>Strengths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strengths</em>' attribute.
	 * @see #getStrengths()
	 * @generated
	 */
	void setStrengths(String value);

	/**
	 * Returns the value of the '<em><b>Weaknesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weaknesses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weaknesses</em>' attribute.
	 * @see #setWeaknesses(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityCompetitor_Weaknesses()
	 * @model
	 * @generated
	 */
	String getWeaknesses();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses <em>Weaknesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weaknesses</em>' attribute.
	 * @see #getWeaknesses()
	 * @generated
	 */
	void setWeaknesses(String value);

} // SalesOpportunityCompetitor
