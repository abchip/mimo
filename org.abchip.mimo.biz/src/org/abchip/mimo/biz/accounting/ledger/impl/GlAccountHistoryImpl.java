/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountHistory;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getEndingBalance <em>Ending Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getPostedCredits <em>Posted Credits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getPostedDebits <em>Posted Debits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
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
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;
	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected CustomTimePeriod customTimePeriodId;

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
	public CustomTimePeriod getCustomTimePeriodId() {
		if (customTimePeriodId != null && ((EObject)customTimePeriodId).eIsProxy()) {
			InternalEObject oldCustomTimePeriodId = (InternalEObject)customTimePeriodId;
			customTimePeriodId = (CustomTimePeriod)eResolveProxy(oldCustomTimePeriodId);
			if (customTimePeriodId != oldCustomTimePeriodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
			}
		}
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTimePeriod basicGetCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(CustomTimePeriod newCustomTimePeriodId) {
		CustomTimePeriod oldCustomTimePeriodId = customTimePeriodId;
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
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		Party oldOrganizationPartyId = organizationPartyId;
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
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
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
		GlAccount oldGlAccountId = glAccountId;
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				return getEndingBalance();
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				return getOpeningBalance();
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				return getPostedCredits();
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				return getPostedDebits();
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				if (resolve) return getCustomTimePeriodId();
				return basicGetCustomTimePeriodId();
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)newValue);
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)null);
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
			case LedgerPackage.GL_ACCOUNT_HISTORY__ENDING_BALANCE:
				return ENDING_BALANCE_EDEFAULT == null ? endingBalance != null : !ENDING_BALANCE_EDEFAULT.equals(endingBalance);
			case LedgerPackage.GL_ACCOUNT_HISTORY__OPENING_BALANCE:
				return OPENING_BALANCE_EDEFAULT == null ? openingBalance != null : !OPENING_BALANCE_EDEFAULT.equals(openingBalance);
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_CREDITS:
				return POSTED_CREDITS_EDEFAULT == null ? postedCredits != null : !POSTED_CREDITS_EDEFAULT.equals(postedCredits);
			case LedgerPackage.GL_ACCOUNT_HISTORY__POSTED_DEBITS:
				return POSTED_DEBITS_EDEFAULT == null ? postedDebits != null : !POSTED_DEBITS_EDEFAULT.equals(postedDebits);
			case LedgerPackage.GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case LedgerPackage.GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return customTimePeriodId != null;
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
		result.append(" (endingBalance: ");
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
