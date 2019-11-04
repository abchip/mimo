/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote;
import org.abchip.mimo.biz.order.quote.Quote;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl#getQuoteId <em>Quote Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityQuoteImpl extends BizEntityImpl implements SalesOpportunityQuote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OPPORTUNITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected String salesOpportunityId = SALES_OPPORTUNITY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuoteId() <em>Quote Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected Quote quoteId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityQuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_QUOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quote getQuoteId() {
		if (quoteId != null && ((EObject)quoteId).eIsProxy()) {
			InternalEObject oldQuoteId = (InternalEObject)quoteId;
			quoteId = (Quote)eResolveProxy(oldQuoteId);
			if (quoteId != oldQuoteId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID, oldQuoteId, quoteId));
			}
		}
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quote basicGetQuoteId() {
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(Quote newQuoteId) {
		Quote oldQuoteId = quoteId;
		quoteId = newQuoteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID, oldQuoteId, quoteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(String newSalesOpportunityId) {
		String oldSalesOpportunityId = salesOpportunityId;
		salesOpportunityId = newSalesOpportunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID:
				return getSalesOpportunityId();
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID:
				if (resolve) return getQuoteId();
				return basicGetQuoteId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID:
				setQuoteId((Quote)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId(SALES_OPPORTUNITY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID:
				setQuoteId((Quote)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID:
				return SALES_OPPORTUNITY_ID_EDEFAULT == null ? salesOpportunityId != null : !SALES_OPPORTUNITY_ID_EDEFAULT.equals(salesOpportunityId);
			case OpportunityPackage.SALES_OPPORTUNITY_QUOTE__QUOTE_ID:
				return quoteId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (salesOpportunityId: ");
		result.append(salesOpportunityId);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityQuoteImpl
