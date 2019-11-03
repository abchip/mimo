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

import org.abchip.mimo.biz.accounting.ledger.GlBudgetXref;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Budget Xref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getAllocationPercentage <em>Allocation Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl#getThruDate <em>Thru Date</em>}</li>
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
	 * The default value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountId = GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemTypeId = BUDGET_ITEM_TYPE_ID_EDEFAULT;
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
		BigDecimal oldAllocationPercentage = allocationPercentage;
		allocationPercentage = newAllocationPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE, oldAllocationPercentage, allocationPercentage));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_BUDGET_XREF__FROM_DATE, oldFromDate, fromDate));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_BUDGET_XREF__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		String oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemTypeId() {
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(String newBudgetItemTypeId) {
		String oldBudgetItemTypeId = budgetItemTypeId;
		budgetItemTypeId = newBudgetItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID, oldBudgetItemTypeId, budgetItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				return getGlAccountId();
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				return getBudgetItemTypeId();
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				return getFromDate();
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				return getAllocationPercentage();
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				return getThruDate();
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
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				setGlAccountId((String)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((String)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				setAllocationPercentage((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				setThruDate((Date)newValue);
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
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				setGlAccountId(GL_ACCOUNT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId(BUDGET_ITEM_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				setAllocationPercentage(ALLOCATION_PERCENTAGE_EDEFAULT);
				return;
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case LedgerPackage.GL_BUDGET_XREF__GL_ACCOUNT_ID:
				return GL_ACCOUNT_ID_EDEFAULT == null ? glAccountId != null : !GL_ACCOUNT_ID_EDEFAULT.equals(glAccountId);
			case LedgerPackage.GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID:
				return BUDGET_ITEM_TYPE_ID_EDEFAULT == null ? budgetItemTypeId != null : !BUDGET_ITEM_TYPE_ID_EDEFAULT.equals(budgetItemTypeId);
			case LedgerPackage.GL_BUDGET_XREF__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.GL_BUDGET_XREF__ALLOCATION_PERCENTAGE:
				return ALLOCATION_PERCENTAGE_EDEFAULT == null ? allocationPercentage != null : !ALLOCATION_PERCENTAGE_EDEFAULT.equals(allocationPercentage);
			case LedgerPackage.GL_BUDGET_XREF__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (glAccountId: ");
		result.append(glAccountId);
		result.append(", budgetItemTypeId: ");
		result.append(budgetItemTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", allocationPercentage: ");
		result.append(allocationPercentage);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //GlBudgetXrefImpl
