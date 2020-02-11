/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage
 * @generated
 */
public interface OpportunityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpportunityFactory eINSTANCE = org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sales Forecast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Forecast</em>'.
	 * @generated
	 */
	SalesForecast createSalesForecast();

	/**
	 * Returns a new object of class '<em>Sales Forecast Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Forecast Detail</em>'.
	 * @generated
	 */
	SalesForecastDetail createSalesForecastDetail();

	/**
	 * Returns a new object of class '<em>Sales Forecast History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Forecast History</em>'.
	 * @generated
	 */
	SalesForecastHistory createSalesForecastHistory();

	/**
	 * Returns a new object of class '<em>Sales Opportunity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity</em>'.
	 * @generated
	 */
	SalesOpportunity createSalesOpportunity();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Competitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Competitor</em>'.
	 * @generated
	 */
	SalesOpportunityCompetitor createSalesOpportunityCompetitor();

	/**
	 * Returns a new object of class '<em>Sales Opportunity History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity History</em>'.
	 * @generated
	 */
	SalesOpportunityHistory createSalesOpportunityHistory();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Quote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Quote</em>'.
	 * @generated
	 */
	SalesOpportunityQuote createSalesOpportunityQuote();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Role</em>'.
	 * @generated
	 */
	SalesOpportunityRole createSalesOpportunityRole();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Stage</em>'.
	 * @generated
	 */
	SalesOpportunityStage createSalesOpportunityStage();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Trck Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Trck Code</em>'.
	 * @generated
	 */
	SalesOpportunityTrckCode createSalesOpportunityTrckCode();

	/**
	 * Returns a new object of class '<em>Sales Opportunity Work Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sales Opportunity Work Effort</em>'.
	 * @generated
	 */
	SalesOpportunityWorkEffort createSalesOpportunityWorkEffort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpportunityPackage getOpportunityPackage();

} //OpportunityFactory
