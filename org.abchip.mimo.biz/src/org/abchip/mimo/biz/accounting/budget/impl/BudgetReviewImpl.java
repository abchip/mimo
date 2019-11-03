/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetReview;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl#getBudgetReviewId <em>Budget Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl#getBudgetReviewResultTypeId <em>Budget Review Result Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetReviewImpl#getReviewDate <em>Review Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetReviewImpl extends BizEntityImpl implements BudgetReview {
	/**
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetReviewId() <em>Budget Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetReviewId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_REVIEW_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetReviewId() <em>Budget Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetReviewId()
	 * @generated
	 * @ordered
	 */
	protected String budgetReviewId = BUDGET_REVIEW_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetReviewResultTypeId() <em>Budget Review Result Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetReviewResultTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_REVIEW_RESULT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetReviewResultTypeId() <em>Budget Review Result Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetReviewResultTypeId()
	 * @generated
	 * @ordered
	 */
	protected String budgetReviewResultTypeId = BUDGET_REVIEW_RESULT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date reviewDate = REVIEW_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetReviewId() {
		return budgetReviewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetReviewId(String newBudgetReviewId) {
		String oldBudgetReviewId = budgetReviewId;
		budgetReviewId = newBudgetReviewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_ID, oldBudgetReviewId, budgetReviewId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVIEW__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		Date oldReviewDate = reviewDate;
		reviewDate = newReviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVIEW__REVIEW_DATE, oldReviewDate, reviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVIEW__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetReviewResultTypeId() {
		return budgetReviewResultTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetReviewResultTypeId(String newBudgetReviewResultTypeId) {
		String oldBudgetReviewResultTypeId = budgetReviewResultTypeId;
		budgetReviewResultTypeId = newBudgetReviewResultTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID, oldBudgetReviewResultTypeId, budgetReviewResultTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVIEW__BUDGET_ID:
				return getBudgetId();
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_ID:
				return getBudgetReviewId();
			case BudgetPackage.BUDGET_REVIEW__PARTY_ID:
				return getPartyId();
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID:
				return getBudgetReviewResultTypeId();
			case BudgetPackage.BUDGET_REVIEW__REVIEW_DATE:
				return getReviewDate();
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
			case BudgetPackage.BUDGET_REVIEW__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_ID:
				setBudgetReviewId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVIEW__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID:
				setBudgetReviewResultTypeId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVIEW__REVIEW_DATE:
				setReviewDate((Date)newValue);
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
			case BudgetPackage.BUDGET_REVIEW__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_ID:
				setBudgetReviewId(BUDGET_REVIEW_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVIEW__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID:
				setBudgetReviewResultTypeId(BUDGET_REVIEW_RESULT_TYPE_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVIEW__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
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
			case BudgetPackage.BUDGET_REVIEW__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_ID:
				return BUDGET_REVIEW_ID_EDEFAULT == null ? budgetReviewId != null : !BUDGET_REVIEW_ID_EDEFAULT.equals(budgetReviewId);
			case BudgetPackage.BUDGET_REVIEW__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case BudgetPackage.BUDGET_REVIEW__BUDGET_REVIEW_RESULT_TYPE_ID:
				return BUDGET_REVIEW_RESULT_TYPE_ID_EDEFAULT == null ? budgetReviewResultTypeId != null : !BUDGET_REVIEW_RESULT_TYPE_ID_EDEFAULT.equals(budgetReviewResultTypeId);
			case BudgetPackage.BUDGET_REVIEW__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? reviewDate != null : !REVIEW_DATE_EDEFAULT.equals(reviewDate);
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
		result.append(" (budgetId: ");
		result.append(budgetId);
		result.append(", budgetReviewId: ");
		result.append(budgetReviewId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", budgetReviewResultTypeId: ");
		result.append(budgetReviewResultTypeId);
		result.append(", reviewDate: ");
		result.append(reviewDate);
		result.append(')');
		return result.toString();
	}

} //BudgetReviewImpl
