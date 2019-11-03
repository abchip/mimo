/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.ledger.GlAccountHistory;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getEndingBalance <em>Ending Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getPostedCredits <em>Posted Credits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getPostedDebits <em>Posted Debits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountHistoryImpl extends BizEntityImpl implements GlAccountHistory {
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
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TIME_PERIOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected String customTimePeriodId = CUSTOM_TIME_PERIOD_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndingBalance() <em>Ending Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ENDING_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEndingBalance() <em>Ending Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal endingBalance = ENDING_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOpeningBalance() <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOpeningBalance() <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal openingBalance = OPENING_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostedCredits() <em>Posted Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedCredits()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal POSTED_CREDITS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostedCredits() <em>Posted Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedCredits()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal postedCredits = POSTED_CREDITS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostedDebits() <em>Posted Debits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDebits()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal POSTED_DEBITS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostedDebits() <em>Posted Debits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDebits()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal postedDebits = POSTED_DEBITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(String newCustomTimePeriodId) {
		String oldCustomTimePeriodId = customTimePeriodId;
		customTimePeriodId = newCustomTimePeriodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEndingBalance() {
		return endingBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndingBalance(BigDecimal newEndingBalance) {
		BigDecimal oldEndingBalance = endingBalance;
		endingBalance = newEndingBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE, oldEndingBalance, endingBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningBalance(BigDecimal newOpeningBalance) {
		BigDecimal oldOpeningBalance = openingBalance;
		openingBalance = newOpeningBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE, oldOpeningBalance, openingBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPostedCredits() {
		return postedCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedCredits(BigDecimal newPostedCredits) {
		BigDecimal oldPostedCredits = postedCredits;
		postedCredits = newPostedCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS, oldPostedCredits, postedCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPostedDebits() {
		return postedDebits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDebits(BigDecimal newPostedDebits) {
		BigDecimal oldPostedDebits = postedDebits;
		postedDebits = newPostedDebits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS, oldPostedDebits, postedDebits));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				return getGlAccountId();
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return getCustomTimePeriodId();
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				return getEndingBalance();
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				return getOpeningBalance();
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				return getPostedCredits();
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				return getPostedDebits();
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				setGlAccountId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				setEndingBalance((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				setOpeningBalance((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				setPostedCredits((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				setPostedDebits((BigDecimal)newValue);
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				setGlAccountId(GL_ACCOUNT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId(CUSTOM_TIME_PERIOD_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				setEndingBalance(ENDING_BALANCE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				setOpeningBalance(OPENING_BALANCE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				setPostedCredits(POSTED_CREDITS_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				setPostedDebits(POSTED_DEBITS_EDEFAULT);
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				return GL_ACCOUNT_ID_EDEFAULT == null ? glAccountId != null : !GL_ACCOUNT_ID_EDEFAULT.equals(glAccountId);
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return CUSTOM_TIME_PERIOD_ID_EDEFAULT == null ? customTimePeriodId != null : !CUSTOM_TIME_PERIOD_ID_EDEFAULT.equals(customTimePeriodId);
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				return ENDING_BALANCE_EDEFAULT == null ? endingBalance != null : !ENDING_BALANCE_EDEFAULT.equals(endingBalance);
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				return OPENING_BALANCE_EDEFAULT == null ? openingBalance != null : !OPENING_BALANCE_EDEFAULT.equals(openingBalance);
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				return POSTED_CREDITS_EDEFAULT == null ? postedCredits != null : !POSTED_CREDITS_EDEFAULT.equals(postedCredits);
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				return POSTED_DEBITS_EDEFAULT == null ? postedDebits != null : !POSTED_DEBITS_EDEFAULT.equals(postedDebits);
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
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", customTimePeriodId: ");
		result.append(customTimePeriodId);
		result.append(", endingBalance: ");
		result.append(endingBalance);
		result.append(", openingBalance: ");
		result.append(openingBalance);
		result.append(", postedCredits: ");
		result.append(postedCredits);
		result.append(", postedDebits: ");
		result.append(postedDebits);
		result.append(')');
		return result.toString();
	}

} //GlAccountHistoryImpl
