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
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Competitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getCompetitorPartyId <em>Competitor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getPositionEnumId <em>Position Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getStrengths <em>Strengths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getWeaknesses <em>Weaknesses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
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
	 * The default value of the '{@link #getCompetitorPartyId() <em>Competitor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetitorPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPETITOR_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompetitorPartyId() <em>Competitor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetitorPartyId()
	 * @generated
	 * @ordered
	 */
	protected String competitorPartyId = COMPETITOR_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionEnumId() <em>Position Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionEnumId() <em>Position Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionEnumId()
	 * @generated
	 * @ordered
	 */
	protected String positionEnumId = POSITION_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrengths() <em>Strengths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengths()
	 * @generated
	 * @ordered
	 */
	protected static final String STRENGTHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrengths() <em>Strengths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengths()
	 * @generated
	 * @ordered
	 */
	protected String strengths = STRENGTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeaknesses() <em>Weaknesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected static final String WEAKNESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeaknesses() <em>Weaknesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaknesses()
	 * @generated
	 * @ordered
	 */
	protected String weaknesses = WEAKNESSES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected SalesOpportunity salesOpportunityId;

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
		return competitorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetitorPartyId(String newCompetitorPartyId) {
		String oldCompetitorPartyId = competitorPartyId;
		competitorPartyId = newCompetitorPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID, oldCompetitorPartyId, competitorPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionEnumId() {
		return positionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionEnumId(String newPositionEnumId) {
		String oldPositionEnumId = positionEnumId;
		positionEnumId = newPositionEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID, oldPositionEnumId, positionEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunityId() {
		if (salesOpportunityId != null && ((EObject)salesOpportunityId).eIsProxy()) {
			InternalEObject oldSalesOpportunityId = (InternalEObject)salesOpportunityId;
			salesOpportunityId = (SalesOpportunity)eResolveProxy(oldSalesOpportunityId);
			if (salesOpportunityId != oldSalesOpportunityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
			}
		}
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesOpportunity basicGetSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		SalesOpportunity oldSalesOpportunityId = salesOpportunityId;
		salesOpportunityId = newSalesOpportunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrengths() {
		return strengths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrengths(String newStrengths) {
		String oldStrengths = strengths;
		strengths = newStrengths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS, oldStrengths, strengths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeaknesses() {
		return weaknesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeaknesses(String newWeaknesses) {
		String oldWeaknesses = weaknesses;
		weaknesses = newWeaknesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES, oldWeaknesses, weaknesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID:
				return getCompetitorPartyId();
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID:
				return getPositionEnumId();
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS:
				return getStrengths();
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES:
				return getWeaknesses();
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID:
				if (resolve) return getSalesOpportunityId();
				return basicGetSalesOpportunityId();
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
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID:
				setCompetitorPartyId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID:
				setPositionEnumId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS:
				setStrengths((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES:
				setWeaknesses((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID:
				setCompetitorPartyId(COMPETITOR_PARTY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID:
				setPositionEnumId(POSITION_ENUM_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS:
				setStrengths(STRENGTHS_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES:
				setWeaknesses(WEAKNESSES_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)null);
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
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID:
				return COMPETITOR_PARTY_ID_EDEFAULT == null ? competitorPartyId != null : !COMPETITOR_PARTY_ID_EDEFAULT.equals(competitorPartyId);
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID:
				return POSITION_ENUM_ID_EDEFAULT == null ? positionEnumId != null : !POSITION_ENUM_ID_EDEFAULT.equals(positionEnumId);
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS:
				return STRENGTHS_EDEFAULT == null ? strengths != null : !STRENGTHS_EDEFAULT.equals(strengths);
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES:
				return WEAKNESSES_EDEFAULT == null ? weaknesses != null : !WEAKNESSES_EDEFAULT.equals(weaknesses);
			case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID:
				return salesOpportunityId != null;
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
		result.append(" (competitorPartyId: ");
		result.append(competitorPartyId);
		result.append(", positionEnumId: ");
		result.append(positionEnumId);
		result.append(", strengths: ");
		result.append(strengths);
		result.append(", weaknesses: ");
		result.append(weaknesses);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityCompetitorImpl
