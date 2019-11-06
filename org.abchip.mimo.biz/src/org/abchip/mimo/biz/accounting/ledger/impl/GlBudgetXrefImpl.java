/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.budget.BudgetItemType;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlBudgetXref;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Budget Xref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getAllocationPercentage <em>Allocation Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlBudgetXrefImpl extends BizEntityImpl implements GlBudgetXref {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAllocationPercentage() <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ALLOCATION_PERCENTAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAllocationPercentage() <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal allocationPercentage = ALLOCATION_PERCENTAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;
	/**
	 * The cached value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected BudgetItemType budgetItemTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlBudgetXrefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_BUDGET_XREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAllocationPercentage() {
		return allocationPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationPercentage(BigDecimal newAllocationPercentage) {
		allocationPercentage = newAllocationPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		glAccountId = newGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemType getBudgetItemTypeId() {
		if (budgetItemTypeId != null && ((EObject)budgetItemTypeId).eIsProxy()) {
			InternalEObject oldBudgetItemTypeId = (InternalEObject)budgetItemTypeId;
			budgetItemTypeId = (BudgetItemType)eResolveProxy(oldBudgetItemTypeId);
			if (budgetItemTypeId != oldBudgetItemTypeId) {
			}
		}
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetItemType basicGetBudgetItemTypeId() {
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(BudgetItemType newBudgetItemTypeId) {
		budgetItemTypeId = newBudgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				return getFromDate();
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				return getAllocationPercentage();
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				return getThruDate();
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				if (resolve) return getBudgetItemTypeId();
				return basicGetBudgetItemTypeId();
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
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				setAllocationPercentage((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)newValue);
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
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				setAllocationPercentage(ALLOCATION_PERCENTAGE_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)null);
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
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				return ALLOCATION_PERCENTAGE_EDEFAULT == null ? allocationPercentage != null : !ALLOCATION_PERCENTAGE_EDEFAULT.equals(allocationPercentage);
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				return budgetItemTypeId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", allocationPercentage: ");
		result.append(allocationPercentage);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //GlBudgetXrefImpl
