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

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategory;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Category Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl#getAmountPercentage <em>Amount Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl#getGlAccountCategoryId <em>Gl Account Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountCategoryMemberImpl extends BizEntityImpl implements GlAccountCategoryMember {
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
	 * The default value of the '{@link #getAmountPercentage() <em>Amount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_PERCENTAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmountPercentage() <em>Amount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amountPercentage = AMOUNT_PERCENTAGE_EDEFAULT;
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
	 * The cached value of the '{@link #getGlAccountCategoryId() <em>Gl Account Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountCategoryId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountCategory glAccountCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountCategoryMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_CATEGORY_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountPercentage() {
		return amountPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountPercentage(BigDecimal newAmountPercentage) {
		amountPercentage = newAmountPercentage;
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
	public GlAccountCategory getGlAccountCategoryId() {
		if (glAccountCategoryId != null && ((EObject)glAccountCategoryId).eIsProxy()) {
			InternalEObject oldGlAccountCategoryId = (InternalEObject)glAccountCategoryId;
			glAccountCategoryId = (GlAccountCategory)eResolveProxy(oldGlAccountCategoryId);
			if (glAccountCategoryId != oldGlAccountCategoryId) {
			}
		}
		return glAccountCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountCategory basicGetGlAccountCategoryId() {
		return glAccountCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountCategoryId(GlAccountCategory newGlAccountCategoryId) {
		glAccountCategoryId = newGlAccountCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE:
				return getFromDate();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE:
				return getAmountPercentage();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE:
				return getThruDate();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID:
				if (resolve) return getGlAccountCategoryId();
				return basicGetGlAccountCategoryId();
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE:
				setAmountPercentage((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID:
				setGlAccountCategoryId((GlAccountCategory)newValue);
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE:
				setAmountPercentage(AMOUNT_PERCENTAGE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID:
				setGlAccountCategoryId((GlAccountCategory)null);
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE:
				return AMOUNT_PERCENTAGE_EDEFAULT == null ? amountPercentage != null : !AMOUNT_PERCENTAGE_EDEFAULT.equals(amountPercentage);
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID:
				return glAccountCategoryId != null;
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
		result.append(", amountPercentage: ");
		result.append(amountPercentage);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //GlAccountCategoryMemberImpl
