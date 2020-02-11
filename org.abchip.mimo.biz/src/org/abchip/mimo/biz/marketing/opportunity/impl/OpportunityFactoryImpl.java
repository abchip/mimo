/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import org.abchip.mimo.biz.marketing.opportunity.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpportunityFactoryImpl extends EFactoryImpl implements OpportunityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpportunityFactory init() {
		try {
			OpportunityFactory theOpportunityFactory = (OpportunityFactory)EPackage.Registry.INSTANCE.getEFactory(OpportunityPackage.eNS_URI);
			if (theOpportunityFactory != null) {
				return theOpportunityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpportunityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpportunityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpportunityPackage.SALES_FORECAST: return (EObject)createSalesForecast();
			case OpportunityPackage.SALES_FORECAST_DETAIL: return (EObject)createSalesForecastDetail();
			case OpportunityPackage.SALES_FORECAST_HISTORY: return (EObject)createSalesForecastHistory();
			case OpportunityPackage.SALES_OPPORTUNITY: return (EObject)createSalesOpportunity();
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR: return (EObject)createSalesOpportunityCompetitor();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY: return (EObject)createSalesOpportunityHistory();
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE: return (EObject)createSalesOpportunityQuote();
			case OpportunityPackage.SALES_OPPORTUNITY_ROLE: return (EObject)createSalesOpportunityRole();
			case OpportunityPackage.SALES_OPPORTUNITY_STAGE: return (EObject)createSalesOpportunityStage();
			case OpportunityPackage.SALES_OPPORTUNITY_TRCK_CODE: return (EObject)createSalesOpportunityTrckCode();
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT: return (EObject)createSalesOpportunityWorkEffort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecast createSalesForecast() {
		SalesForecastImpl salesForecast = new SalesForecastImpl();
		return salesForecast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecastDetail createSalesForecastDetail() {
		SalesForecastDetailImpl salesForecastDetail = new SalesForecastDetailImpl();
		return salesForecastDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecastHistory createSalesForecastHistory() {
		SalesForecastHistoryImpl salesForecastHistory = new SalesForecastHistoryImpl();
		return salesForecastHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity createSalesOpportunity() {
		SalesOpportunityImpl salesOpportunity = new SalesOpportunityImpl();
		return salesOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityCompetitor createSalesOpportunityCompetitor() {
		SalesOpportunityCompetitorImpl salesOpportunityCompetitor = new SalesOpportunityCompetitorImpl();
		return salesOpportunityCompetitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityHistory createSalesOpportunityHistory() {
		SalesOpportunityHistoryImpl salesOpportunityHistory = new SalesOpportunityHistoryImpl();
		return salesOpportunityHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityQuote createSalesOpportunityQuote() {
		SalesOpportunityQuoteImpl salesOpportunityQuote = new SalesOpportunityQuoteImpl();
		return salesOpportunityQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityRole createSalesOpportunityRole() {
		SalesOpportunityRoleImpl salesOpportunityRole = new SalesOpportunityRoleImpl();
		return salesOpportunityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityStage createSalesOpportunityStage() {
		SalesOpportunityStageImpl salesOpportunityStage = new SalesOpportunityStageImpl();
		return salesOpportunityStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityTrckCode createSalesOpportunityTrckCode() {
		SalesOpportunityTrckCodeImpl salesOpportunityTrckCode = new SalesOpportunityTrckCodeImpl();
		return salesOpportunityTrckCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityWorkEffort createSalesOpportunityWorkEffort() {
		SalesOpportunityWorkEffortImpl salesOpportunityWorkEffort = new SalesOpportunityWorkEffortImpl();
		return salesOpportunityWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpportunityPackage getOpportunityPackage() {
		return (OpportunityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpportunityPackage getPackage() {
		return OpportunityPackage.eINSTANCE;
	}

} //OpportunityFactoryImpl
