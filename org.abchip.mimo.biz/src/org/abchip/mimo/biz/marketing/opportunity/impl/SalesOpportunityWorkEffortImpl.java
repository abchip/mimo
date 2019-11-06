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
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Work Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityWorkEffortImpl extends BizEntityImpl implements SalesOpportunityWorkEffort {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityWorkEffortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_WORK_EFFORT;
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
		salesOpportunityId = newSalesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID:
				if (resolve) return getSalesOpportunityId();
				return basicGetSalesOpportunityId();
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
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
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)null);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
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
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID:
				return salesOpportunityId != null;
			case OpportunityPackage.SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID:
				return workEffortId != null;
		}
		return super.eIsSet(featureID);
	}

} //SalesOpportunityWorkEffortImpl
