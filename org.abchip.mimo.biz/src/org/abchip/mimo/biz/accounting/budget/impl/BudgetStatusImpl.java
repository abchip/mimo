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
import org.abchip.mimo.biz.accounting.budget.BudgetStatus;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetStatusImpl extends BizEntityImpl implements BudgetStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate = STATUS_DATE_EDEFAULT;
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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changeByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeByUserLoginId() {
		if (changeByUserLoginId != null && ((EObject)changeByUserLoginId).eIsProxy()) {
			InternalEObject oldChangeByUserLoginId = (InternalEObject)changeByUserLoginId;
			changeByUserLoginId = (UserLogin)eResolveProxy(oldChangeByUserLoginId);
			if (changeByUserLoginId != oldChangeByUserLoginId) {
			}
		}
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(UserLogin newChangeByUserLoginId) {
		changeByUserLoginId = newChangeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDate(Date newStatusDate) {
		statusDate = newStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
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
		budgetId = newBudgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_STATUS__COMMENTS:
				return getComments();
			case BudgetPackage.BUDGET_STATUS__STATUS_DATE:
				return getStatusDate();
			case BudgetPackage.BUDGET_STATUS__BUDGET_ID:
				if (resolve) return getBudgetId();
				return basicGetBudgetId();
			case BudgetPackage.BUDGET_STATUS__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case BudgetPackage.BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID:
				if (resolve) return getChangeByUserLoginId();
				return basicGetChangeByUserLoginId();
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
			case BudgetPackage.BUDGET_STATUS__COMMENTS:
				setComments((String)newValue);
				return;
			case BudgetPackage.BUDGET_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case BudgetPackage.BUDGET_STATUS__BUDGET_ID:
				setBudgetId((Budget)newValue);
				return;
			case BudgetPackage.BUDGET_STATUS__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case BudgetPackage.BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)newValue);
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
			case BudgetPackage.BUDGET_STATUS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_STATUS__BUDGET_ID:
				setBudgetId((Budget)null);
				return;
			case BudgetPackage.BUDGET_STATUS__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case BudgetPackage.BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)null);
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
			case BudgetPackage.BUDGET_STATUS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case BudgetPackage.BUDGET_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case BudgetPackage.BUDGET_STATUS__BUDGET_ID:
				return budgetId != null;
			case BudgetPackage.BUDGET_STATUS__STATUS_ID:
				return statusId != null;
			case BudgetPackage.BUDGET_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return changeByUserLoginId != null;
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
		result.append(" (comments: ");
		result.append(comments);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(')');
		return result.toString();
	}

} //BudgetStatusImpl
