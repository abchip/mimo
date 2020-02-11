/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Competitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getCompetitorPartyId <em>Competitor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getPositionEnumId <em>Position Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getStrengths <em>Strengths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityCompetitorImpl extends BizEntityImpl implements SalesOpportunityCompetitor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityCompetitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompetitorPartyId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetitorPartyId(String newCompetitorPartyId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID, newCompetitorPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionEnumId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionEnumId(String newPositionEnumId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID, newPositionEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunityId() {
		return (SalesOpportunity)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID, newSalesOpportunityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrengths() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrengths(String newStrengths) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS, newStrengths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeaknesses() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeaknesses(String newWeaknesses) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES, newWeaknesses);
	}

} //SalesOpportunityCompetitorImpl
