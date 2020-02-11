/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.EftAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eft Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getCompanyNameOnAccount <em>Company Name On Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getNameOnAccount <em>Name On Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getRoutingNumber <em>Routing Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getYearsAtBank <em>Years At Bank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EftAccountImpl extends PaymentMethodImpl implements EftAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EftAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.EFT_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountNumber() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__ACCOUNT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountNumber(String newAccountNumber) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__ACCOUNT_NUMBER, newAccountNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountType() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__ACCOUNT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountType(String newAccountType) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__ACCOUNT_TYPE, newAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBankName() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__BANK_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankName(String newBankName) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__BANK_NAME, newBankName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyNameOnAccount() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyNameOnAccount(String newCompanyNameOnAccount) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT, newCompanyNameOnAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(PaymentPackage.Literals.EFT_ACCOUNT__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameOnAccount() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__NAME_ON_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameOnAccount(String newNameOnAccount) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__NAME_ON_ACCOUNT, newNameOnAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutingNumber() {
		return (String)eGet(PaymentPackage.Literals.EFT_ACCOUNT__ROUTING_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingNumber(String newRoutingNumber) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__ROUTING_NUMBER, newRoutingNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsAtBank() {
		return (Long)eGet(PaymentPackage.Literals.EFT_ACCOUNT__YEARS_AT_BANK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsAtBank(long newYearsAtBank) {
		eSet(PaymentPackage.Literals.EFT_ACCOUNT__YEARS_AT_BANK, newYearsAtBank);
	}

} //EftAccountImpl
