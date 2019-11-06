/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getActualBalance <em>Actual Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getAvailableBalance <em>Available Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountCode <em>Fin Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountName <em>Fin Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountPin <em>Fin Account Pin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getReplenishLevel <em>Replenish Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getPostToGlAccountId <em>Post To Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getReplenishPaymentId <em>Replenish Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountAttributes <em>Fin Account Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountImpl extends BizEntityTypedImpl<FinAccountType> implements FinAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountId = FIN_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getActualBalance() <em>Actual Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActualBalance() <em>Actual Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualBalance = ACTUAL_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAvailableBalance() <em>Available Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVAILABLE_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAvailableBalance() <em>Available Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal availableBalance = AVAILABLE_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFinAccountCode() <em>Fin Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountCode() <em>Fin Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountCode()
	 * @generated
	 * @ordered
	 */
	protected String finAccountCode = FIN_ACCOUNT_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFinAccountName() <em>Fin Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountName() <em>Fin Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountName()
	 * @generated
	 * @ordered
	 */
	protected String finAccountName = FIN_ACCOUNT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFinAccountPin() <em>Fin Account Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountPin()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_PIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountPin() <em>Fin Account Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountPin()
	 * @generated
	 * @ordered
	 */
	protected String finAccountPin = FIN_ACCOUNT_PIN_EDEFAULT;
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
	 * The default value of the '{@link #isIsRefundable() <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefundable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFUNDABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsRefundable() <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefundable()
	 * @generated
	 * @ordered
	 */
	protected boolean isRefundable = IS_REFUNDABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getReplenishLevel() <em>Replenish Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REPLENISH_LEVEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReplenishLevel() <em>Replenish Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal replenishLevel = REPLENISH_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getFinAccountTypeId() <em>Fin Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountType finAccountTypeId;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;
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
	 * The cached value of the '{@link #getOwnerPartyId() <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party ownerPartyId;
	/**
	 * The cached value of the '{@link #getPostToGlAccountId() <em>Post To Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostToGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount postToGlAccountId;
	/**
	 * The cached value of the '{@link #getReplenishPaymentId() <em>Replenish Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishPaymentId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod replenishPaymentId;

	/**
	 * The cached value of the '{@link #getFinAccountAttributes() <em>Fin Account Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> finAccountAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualBalance() {
		return actualBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualBalance(BigDecimal newActualBalance) {
		actualBalance = newActualBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableBalance(BigDecimal newAvailableBalance) {
		availableBalance = newAvailableBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountCode() {
		return finAccountCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountCode(String newFinAccountCode) {
		finAccountCode = newFinAccountCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountName() {
		return finAccountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountName(String newFinAccountName) {
		finAccountName = newFinAccountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountPin() {
		return finAccountPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountPin(String newFinAccountPin) {
		finAccountPin = newFinAccountPin;
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
	public boolean isIsRefundable() {
		return isRefundable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRefundable(boolean newIsRefundable) {
		isRefundable = newIsRefundable;
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
		organizationPartyId = newOrganizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		if (ownerPartyId != null && ((EObject)ownerPartyId).eIsProxy()) {
			InternalEObject oldOwnerPartyId = (InternalEObject)ownerPartyId;
			ownerPartyId = (Party)eResolveProxy(oldOwnerPartyId);
			if (ownerPartyId != oldOwnerPartyId) {
			}
		}
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOwnerPartyId() {
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		ownerPartyId = newOwnerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getPostToGlAccountId() {
		if (postToGlAccountId != null && ((EObject)postToGlAccountId).eIsProxy()) {
			InternalEObject oldPostToGlAccountId = (InternalEObject)postToGlAccountId;
			postToGlAccountId = (GlAccount)eResolveProxy(oldPostToGlAccountId);
			if (postToGlAccountId != oldPostToGlAccountId) {
			}
		}
		return postToGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetPostToGlAccountId() {
		return postToGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostToGlAccountId(GlAccount newPostToGlAccountId) {
		postToGlAccountId = newPostToGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReplenishLevel() {
		return replenishLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishLevel(BigDecimal newReplenishLevel) {
		replenishLevel = newReplenishLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getReplenishPaymentId() {
		if (replenishPaymentId != null && ((EObject)replenishPaymentId).eIsProxy()) {
			InternalEObject oldReplenishPaymentId = (InternalEObject)replenishPaymentId;
			replenishPaymentId = (PaymentMethod)eResolveProxy(oldReplenishPaymentId);
			if (replenishPaymentId != oldReplenishPaymentId) {
			}
		}
		return replenishPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetReplenishPaymentId() {
		return replenishPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishPaymentId(PaymentMethod newReplenishPaymentId) {
		replenishPaymentId = newReplenishPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		statusId = newStatusId;
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
	public List<String> getFinAccountAttributes() {
		if (finAccountAttributes == null) {
			finAccountAttributes = new BasicInternalEList<String>(String.class);
		}
		return finAccountAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountAuths() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderPaymentPreferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentMethods() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getFinAccountTypeId() {
		if (finAccountTypeId != null && ((EObject)finAccountTypeId).eIsProxy()) {
			InternalEObject oldFinAccountTypeId = (InternalEObject)finAccountTypeId;
			finAccountTypeId = (FinAccountType)eResolveProxy(oldFinAccountTypeId);
			if (finAccountTypeId != oldFinAccountTypeId) {
			}
		}
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountType basicGetFinAccountTypeId() {
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(FinAccountType newFinAccountTypeId) {
		finAccountTypeId = newFinAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(String newFinAccountId) {
		finAccountId = newFinAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ID:
				return getFinAccountId();
			case FinaccountPackage.FIN_ACCOUNT__ACTUAL_BALANCE:
				return getActualBalance();
			case FinaccountPackage.FIN_ACCOUNT__AVAILABLE_BALANCE:
				return getAvailableBalance();
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_CODE:
				return getFinAccountCode();
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_NAME:
				return getFinAccountName();
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_PIN:
				return getFinAccountPin();
			case FinaccountPackage.FIN_ACCOUNT__FROM_DATE:
				return getFromDate();
			case FinaccountPackage.FIN_ACCOUNT__IS_REFUNDABLE:
				return isIsRefundable();
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_LEVEL:
				return getReplenishLevel();
			case FinaccountPackage.FIN_ACCOUNT__STATUS_ID:
				return getStatusId();
			case FinaccountPackage.FIN_ACCOUNT__THRU_DATE:
				return getThruDate();
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				if (resolve) return getFinAccountTypeId();
				return basicGetFinAccountTypeId();
			case FinaccountPackage.FIN_ACCOUNT__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case FinaccountPackage.FIN_ACCOUNT__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case FinaccountPackage.FIN_ACCOUNT__OWNER_PARTY_ID:
				if (resolve) return getOwnerPartyId();
				return basicGetOwnerPartyId();
			case FinaccountPackage.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID:
				if (resolve) return getPostToGlAccountId();
				return basicGetPostToGlAccountId();
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_PAYMENT_ID:
				if (resolve) return getReplenishPaymentId();
				return basicGetReplenishPaymentId();
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES:
				return getFinAccountAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ID:
				setFinAccountId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__ACTUAL_BALANCE:
				setActualBalance((BigDecimal)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__AVAILABLE_BALANCE:
				setAvailableBalance((BigDecimal)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_CODE:
				setFinAccountCode((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_NAME:
				setFinAccountName((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_PIN:
				setFinAccountPin((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__IS_REFUNDABLE:
				setIsRefundable((Boolean)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_LEVEL:
				setReplenishLevel((BigDecimal)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__OWNER_PARTY_ID:
				setOwnerPartyId((Party)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID:
				setPostToGlAccountId((GlAccount)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_PAYMENT_ID:
				setReplenishPaymentId((PaymentMethod)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES:
				getFinAccountAttributes().clear();
				getFinAccountAttributes().addAll((Collection<? extends String>)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ID:
				setFinAccountId(FIN_ACCOUNT_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__ACTUAL_BALANCE:
				setActualBalance(ACTUAL_BALANCE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__AVAILABLE_BALANCE:
				setAvailableBalance(AVAILABLE_BALANCE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_CODE:
				setFinAccountCode(FIN_ACCOUNT_CODE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_NAME:
				setFinAccountName(FIN_ACCOUNT_NAME_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_PIN:
				setFinAccountPin(FIN_ACCOUNT_PIN_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__IS_REFUNDABLE:
				setIsRefundable(IS_REFUNDABLE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_LEVEL:
				setReplenishLevel(REPLENISH_LEVEL_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__OWNER_PARTY_ID:
				setOwnerPartyId((Party)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID:
				setPostToGlAccountId((GlAccount)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_PAYMENT_ID:
				setReplenishPaymentId((PaymentMethod)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES:
				getFinAccountAttributes().clear();
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
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ID:
				return FIN_ACCOUNT_ID_EDEFAULT == null ? finAccountId != null : !FIN_ACCOUNT_ID_EDEFAULT.equals(finAccountId);
			case FinaccountPackage.FIN_ACCOUNT__ACTUAL_BALANCE:
				return ACTUAL_BALANCE_EDEFAULT == null ? actualBalance != null : !ACTUAL_BALANCE_EDEFAULT.equals(actualBalance);
			case FinaccountPackage.FIN_ACCOUNT__AVAILABLE_BALANCE:
				return AVAILABLE_BALANCE_EDEFAULT == null ? availableBalance != null : !AVAILABLE_BALANCE_EDEFAULT.equals(availableBalance);
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_CODE:
				return FIN_ACCOUNT_CODE_EDEFAULT == null ? finAccountCode != null : !FIN_ACCOUNT_CODE_EDEFAULT.equals(finAccountCode);
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_NAME:
				return FIN_ACCOUNT_NAME_EDEFAULT == null ? finAccountName != null : !FIN_ACCOUNT_NAME_EDEFAULT.equals(finAccountName);
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_PIN:
				return FIN_ACCOUNT_PIN_EDEFAULT == null ? finAccountPin != null : !FIN_ACCOUNT_PIN_EDEFAULT.equals(finAccountPin);
			case FinaccountPackage.FIN_ACCOUNT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FinaccountPackage.FIN_ACCOUNT__IS_REFUNDABLE:
				return isRefundable != IS_REFUNDABLE_EDEFAULT;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_LEVEL:
				return REPLENISH_LEVEL_EDEFAULT == null ? replenishLevel != null : !REPLENISH_LEVEL_EDEFAULT.equals(replenishLevel);
			case FinaccountPackage.FIN_ACCOUNT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case FinaccountPackage.FIN_ACCOUNT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				return finAccountTypeId != null;
			case FinaccountPackage.FIN_ACCOUNT__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case FinaccountPackage.FIN_ACCOUNT__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case FinaccountPackage.FIN_ACCOUNT__OWNER_PARTY_ID:
				return ownerPartyId != null;
			case FinaccountPackage.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID:
				return postToGlAccountId != null;
			case FinaccountPackage.FIN_ACCOUNT__REPLENISH_PAYMENT_ID:
				return replenishPaymentId != null;
			case FinaccountPackage.FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES:
				return finAccountAttributes != null && !finAccountAttributes.isEmpty();
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
		result.append(" (finAccountId: ");
		result.append(finAccountId);
		result.append(", actualBalance: ");
		result.append(actualBalance);
		result.append(", availableBalance: ");
		result.append(availableBalance);
		result.append(", finAccountCode: ");
		result.append(finAccountCode);
		result.append(", finAccountName: ");
		result.append(finAccountName);
		result.append(", finAccountPin: ");
		result.append(finAccountPin);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", isRefundable: ");
		result.append(isRefundable);
		result.append(", replenishLevel: ");
		result.append(replenishLevel);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", finAccountAttributes: ");
		result.append(finAccountAttributes);
		result.append(')');
		return result.toString();
	}

} //FinAccountImpl
