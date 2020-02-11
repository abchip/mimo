/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountAttributes <em>Fin Account Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountCode <em>Fin Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountName <em>Fin Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountPin <em>Fin Account Pin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getPostToGlAccountId <em>Post To Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getReplenishLevel <em>Replenish Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getReplenishPaymentId <em>Replenish Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl#getThruDate <em>Thru Date</em>}</li>
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
		return (BigDecimal)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__ACTUAL_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualBalance(BigDecimal newActualBalance) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__ACTUAL_BALANCE, newActualBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableBalance() {
		return (BigDecimal)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__AVAILABLE_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableBalance(BigDecimal newAvailableBalance) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__AVAILABLE_BALANCE, newAvailableBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FinAccountAttribute> getFinAccountAttributes() {
		return (List<FinAccountAttribute>)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountCode() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountCode(String newFinAccountCode) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_CODE, newFinAccountCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountName() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountName(String newFinAccountName) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_NAME, newFinAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountPin() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_PIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountPin(String newFinAccountPin) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_PIN, newFinAccountPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRefundable() {
		return (Boolean)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__IS_REFUNDABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRefundable(boolean newIsRefundable) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__IS_REFUNDABLE, newIsRefundable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		return (Party)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__ORGANIZATION_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__ORGANIZATION_PARTY_ID, newOrganizationPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		return (Party)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__OWNER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__OWNER_PARTY_ID, newOwnerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getPostToGlAccountId() {
		return (GlAccount)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostToGlAccountId(GlAccount newPostToGlAccountId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID, newPostToGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReplenishLevel() {
		return (BigDecimal)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__REPLENISH_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishLevel(BigDecimal newReplenishLevel) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__REPLENISH_LEVEL, newReplenishLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getReplenishPaymentId() {
		return (PaymentMethod)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__REPLENISH_PAYMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishPaymentId(PaymentMethod newReplenishPaymentId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__REPLENISH_PAYMENT_ID, newReplenishPaymentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getFinAccountTypeId() {
		return (FinAccountType)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(FinAccountType newFinAccountTypeId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID, newFinAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(String newFinAccountId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT__FIN_ACCOUNT_ID, newFinAccountId);
	}

} //FinAccountImpl
