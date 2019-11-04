/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.budget.Budget;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetRevision;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl#getRevisionSeqId <em>Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl#getDateRevised <em>Date Revised</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpl#getBudgetId <em>Budget Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetRevisionImpl extends BizEntityImpl implements BudgetRevision {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getRevisionSeqId() <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevisionSeqId() <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String revisionSeqId = REVISION_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateRevised() <em>Date Revised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRevised()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_REVISED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateRevised() <em>Date Revised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRevised()
	 * @generated
	 * @ordered
	 */
	protected Date dateRevised = DATE_REVISED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected Budget budgetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateRevised() {
		return dateRevised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateRevised(Date newDateRevised) {
		Date oldDateRevised = dateRevised;
		dateRevised = newDateRevised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION__DATE_REVISED, oldDateRevised, dateRevised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionSeqId() {
		return revisionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionSeqId(String newRevisionSeqId) {
		String oldRevisionSeqId = revisionSeqId;
		revisionSeqId = newRevisionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION__REVISION_SEQ_ID, oldRevisionSeqId, revisionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Budget getBudgetId() {
		if (budgetId != null && ((EObject)budgetId).eIsProxy()) {
			InternalEObject oldBudgetId = (InternalEObject)budgetId;
			budgetId = (Budget)eResolveProxy(oldBudgetId);
			if (budgetId != oldBudgetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetPackage.BUDGET_REVISION__BUDGET_ID, oldBudgetId, budgetId));
			}
		}
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Budget basicGetBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(Budget newBudgetId) {
		Budget oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVISION__REVISION_SEQ_ID:
				return getRevisionSeqId();
			case BudgetPackage.BUDGET_REVISION__DATE_REVISED:
				return getDateRevised();
			case BudgetPackage.BUDGET_REVISION__BUDGET_ID:
				if (resolve) return getBudgetId();
				return basicGetBudgetId();
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
			case BudgetPackage.BUDGET_REVISION__REVISION_SEQ_ID:
				setRevisionSeqId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION__DATE_REVISED:
				setDateRevised((Date)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION__BUDGET_ID:
				setBudgetId((Budget)newValue);
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
			case BudgetPackage.BUDGET_REVISION__REVISION_SEQ_ID:
				setRevisionSeqId(REVISION_SEQ_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION__DATE_REVISED:
				setDateRevised(DATE_REVISED_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION__BUDGET_ID:
				setBudgetId((Budget)null);
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
			case BudgetPackage.BUDGET_REVISION__REVISION_SEQ_ID:
				return REVISION_SEQ_ID_EDEFAULT == null ? revisionSeqId != null : !REVISION_SEQ_ID_EDEFAULT.equals(revisionSeqId);
			case BudgetPackage.BUDGET_REVISION__DATE_REVISED:
				return DATE_REVISED_EDEFAULT == null ? dateRevised != null : !DATE_REVISED_EDEFAULT.equals(dateRevised);
			case BudgetPackage.BUDGET_REVISION__BUDGET_ID:
				return budgetId != null;
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
		result.append(" (revisionSeqId: ");
		result.append(revisionSeqId);
		result.append(", dateRevised: ");
		result.append(dateRevised);
		result.append(')');
		return result.toString();
	}

} //BudgetRevisionImpl
