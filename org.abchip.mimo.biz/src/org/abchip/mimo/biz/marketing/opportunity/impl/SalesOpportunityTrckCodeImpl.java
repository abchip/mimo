/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Trck Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl#getReceivedDate <em>Received Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityTrckCodeImpl extends BizEntityImpl implements SalesOpportunityTrckCode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityTrckCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReceivedDate() {
		return (Date)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedDate(Date newReceivedDate) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE, newReceivedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunityId() {
		return (SalesOpportunity)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID, newSalesOpportunityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCodeId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(String newTrackingCodeId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID, newTrackingCodeId);
	}

} //SalesOpportunityTrckCodeImpl
