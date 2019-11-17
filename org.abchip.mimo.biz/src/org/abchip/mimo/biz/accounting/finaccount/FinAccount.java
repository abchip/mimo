/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getActualBalance <em>Actual Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getAvailableBalance <em>Available Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountCode <em>Fin Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountName <em>Fin Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountPin <em>Fin Account Pin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishLevel <em>Replenish Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getPostToGlAccountId <em>Post To Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishPaymentId <em>Replenish Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountAttributes <em>Fin Account Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount()
 * @model
 * @generated
 */
public interface FinAccount extends BizEntityTyped<FinAccountType> {
	/**
	 * Returns the value of the '<em><b>Actual Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Balance</em>' attribute.
	 * @see #setActualBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_ActualBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getActualBalance <em>Actual Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Balance</em>' attribute.
	 * @see #getActualBalance()
	 * @generated
	 */
	void setActualBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Available Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Balance</em>' attribute.
	 * @see #setAvailableBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_AvailableBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAvailableBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getAvailableBalance <em>Available Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Balance</em>' attribute.
	 * @see #getAvailableBalance()
	 * @generated
	 */
	void setAvailableBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Fin Account Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Code</em>' attribute.
	 * @see #setFinAccountCode(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountCode()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getFinAccountCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountCode <em>Fin Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Code</em>' attribute.
	 * @see #getFinAccountCode()
	 * @generated
	 */
	void setFinAccountCode(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Name</em>' attribute.
	 * @see #setFinAccountName(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getFinAccountName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountName <em>Fin Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Name</em>' attribute.
	 * @see #getFinAccountName()
	 * @generated
	 */
	void setFinAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Pin</em>' attribute.
	 * @see #setFinAccountPin(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountPin()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getFinAccountPin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountPin <em>Fin Account Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Pin</em>' attribute.
	 * @see #getFinAccountPin()
	 * @generated
	 */
	void setFinAccountPin(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FromDate()
	 * @model annotation="mimo-ent-format type='date-time'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Refundable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refundable</em>' attribute.
	 * @see #setIsRefundable(boolean)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_IsRefundable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isIsRefundable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#isIsRefundable <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refundable</em>' attribute.
	 * @see #isIsRefundable()
	 * @generated
	 */
	void setIsRefundable(boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' reference.
	 * @see #setOrganizationPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_OrganizationPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOrganizationPartyId <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' reference.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' reference.
	 * @see #setOwnerPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_OwnerPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOwnerPartyId <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' reference.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Post To Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post To Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post To Gl Account Id</em>' reference.
	 * @see #setPostToGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_PostToGlAccountId()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getPostToGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getPostToGlAccountId <em>Post To Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post To Gl Account Id</em>' reference.
	 * @see #getPostToGlAccountId()
	 * @generated
	 */
	void setPostToGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Replenish Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Level</em>' attribute.
	 * @see #setReplenishLevel(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_ReplenishLevel()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReplenishLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishLevel <em>Replenish Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Level</em>' attribute.
	 * @see #getReplenishLevel()
	 * @generated
	 */
	void setReplenishLevel(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Replenish Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Payment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Payment Id</em>' reference.
	 * @see #setReplenishPaymentId(PaymentMethod)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_ReplenishPaymentId()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getReplenishPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishPaymentId <em>Replenish Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Payment Id</em>' reference.
	 * @see #getReplenishPaymentId()
	 * @generated
	 */
	void setReplenishPaymentId(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_StatusId()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_ThruDate()
	 * @model annotation="mimo-ent-format type='date-time'"
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fin Account Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountAttributes()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountAttribute'"
	 * @generated
	 */
	List<String> getFinAccountAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountAuth' route='finAccountId'"
	 * @generated
	 */
	List<String> finAccountAuths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountTrans' route='finAccountId'"
	 * @generated
	 */
	List<String> finAccountTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderPaymentPreference' route='finAccountId'"
	 * @generated
	 */
	List<String> orderPaymentPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentMethod' route='finAccountId'"
	 * @generated
	 */
	List<String> paymentMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='finAccountId'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * Returns the value of the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Id</em>' reference.
	 * @see #setFinAccountTypeId(FinAccountType)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountTypeId()
	 * @model keys="finAccountTypeId"
	 * @generated
	 */
	FinAccountType getFinAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountTypeId <em>Fin Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type Id</em>' reference.
	 * @see #getFinAccountTypeId()
	 * @generated
	 */
	void setFinAccountTypeId(FinAccountType value);

	/**
	 * Returns the value of the '<em><b>Fin Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Id</em>' attribute.
	 * @see #setFinAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccount_FinAccountId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountId <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' attribute.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(String value);

} // FinAccount
