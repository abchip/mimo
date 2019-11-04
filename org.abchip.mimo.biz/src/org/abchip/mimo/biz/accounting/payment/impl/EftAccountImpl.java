/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.EftAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getNameOnAccount <em>Name On Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getRoutingNumber <em>Routing Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getYearsAtBank <em>Years At Bank</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl#getContactMechId <em>Contact Mech Id</em>}</li>
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
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected String accountType = ACCOUNT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyNameOnAccount() <em>Company Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameOnAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_ON_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyNameOnAccount() <em>Company Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameOnAccount()
	 * @generated
	 * @ordered
	 */
	protected String companyNameOnAccount = COMPANY_NAME_ON_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameOnAccount() <em>Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOnAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ON_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOnAccount() <em>Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOnAccount()
	 * @generated
	 * @ordered
	 */
	protected String nameOnAccount = NAME_ON_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingNumber() <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoutingNumber() <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingNumber()
	 * @generated
	 * @ordered
	 */
	protected String routingNumber = ROUTING_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getYearsAtBank() <em>Years At Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsAtBank()
	 * @generated
	 * @ordered
	 */
	protected static final long YEARS_AT_BANK_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getYearsAtBank() <em>Years At Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsAtBank()
	 * @generated
	 * @ordered
	 */
	protected long yearsAtBank = YEARS_AT_BANK_EDEFAULT;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

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
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountNumber(String newAccountNumber) {
		String oldAccountNumber = accountNumber;
		accountNumber = newAccountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__ACCOUNT_NUMBER, oldAccountNumber, accountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountType() {
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountType(String newAccountType) {
		String oldAccountType = accountType;
		accountType = newAccountType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__ACCOUNT_TYPE, oldAccountType, accountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBankName() {
		return bankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankName(String newBankName) {
		String oldBankName = bankName;
		bankName = newBankName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__BANK_NAME, oldBankName, bankName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyNameOnAccount() {
		return companyNameOnAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyNameOnAccount(String newCompanyNameOnAccount) {
		String oldCompanyNameOnAccount = companyNameOnAccount;
		companyNameOnAccount = newCompanyNameOnAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT, oldCompanyNameOnAccount, companyNameOnAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameOnAccount() {
		return nameOnAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameOnAccount(String newNameOnAccount) {
		String oldNameOnAccount = nameOnAccount;
		nameOnAccount = newNameOnAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__NAME_ON_ACCOUNT, oldNameOnAccount, nameOnAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutingNumber() {
		return routingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingNumber(String newRoutingNumber) {
		String oldRoutingNumber = routingNumber;
		routingNumber = newRoutingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__ROUTING_NUMBER, oldRoutingNumber, routingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsAtBank() {
		return yearsAtBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsAtBank(long newYearsAtBank) {
		long oldYearsAtBank = yearsAtBank;
		yearsAtBank = newYearsAtBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.EFT_ACCOUNT__YEARS_AT_BANK, oldYearsAtBank, yearsAtBank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_NUMBER:
				return getAccountNumber();
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_TYPE:
				return getAccountType();
			case PaymentPackage.EFT_ACCOUNT__BANK_NAME:
				return getBankName();
			case PaymentPackage.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT:
				return getCompanyNameOnAccount();
			case PaymentPackage.EFT_ACCOUNT__NAME_ON_ACCOUNT:
				return getNameOnAccount();
			case PaymentPackage.EFT_ACCOUNT__ROUTING_NUMBER:
				return getRoutingNumber();
			case PaymentPackage.EFT_ACCOUNT__YEARS_AT_BANK:
				return getYearsAtBank();
			case PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
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
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_TYPE:
				setAccountType((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__BANK_NAME:
				setBankName((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT:
				setCompanyNameOnAccount((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__NAME_ON_ACCOUNT:
				setNameOnAccount((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__ROUTING_NUMBER:
				setRoutingNumber((String)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__YEARS_AT_BANK:
				setYearsAtBank((Long)newValue);
				return;
			case PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
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
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber(ACCOUNT_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_TYPE:
				setAccountType(ACCOUNT_TYPE_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__BANK_NAME:
				setBankName(BANK_NAME_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT:
				setCompanyNameOnAccount(COMPANY_NAME_ON_ACCOUNT_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__NAME_ON_ACCOUNT:
				setNameOnAccount(NAME_ON_ACCOUNT_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__ROUTING_NUMBER:
				setRoutingNumber(ROUTING_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__YEARS_AT_BANK:
				setYearsAtBank(YEARS_AT_BANK_EDEFAULT);
				return;
			case PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
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
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_NUMBER:
				return ACCOUNT_NUMBER_EDEFAULT == null ? accountNumber != null : !ACCOUNT_NUMBER_EDEFAULT.equals(accountNumber);
			case PaymentPackage.EFT_ACCOUNT__ACCOUNT_TYPE:
				return ACCOUNT_TYPE_EDEFAULT == null ? accountType != null : !ACCOUNT_TYPE_EDEFAULT.equals(accountType);
			case PaymentPackage.EFT_ACCOUNT__BANK_NAME:
				return BANK_NAME_EDEFAULT == null ? bankName != null : !BANK_NAME_EDEFAULT.equals(bankName);
			case PaymentPackage.EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT:
				return COMPANY_NAME_ON_ACCOUNT_EDEFAULT == null ? companyNameOnAccount != null : !COMPANY_NAME_ON_ACCOUNT_EDEFAULT.equals(companyNameOnAccount);
			case PaymentPackage.EFT_ACCOUNT__NAME_ON_ACCOUNT:
				return NAME_ON_ACCOUNT_EDEFAULT == null ? nameOnAccount != null : !NAME_ON_ACCOUNT_EDEFAULT.equals(nameOnAccount);
			case PaymentPackage.EFT_ACCOUNT__ROUTING_NUMBER:
				return ROUTING_NUMBER_EDEFAULT == null ? routingNumber != null : !ROUTING_NUMBER_EDEFAULT.equals(routingNumber);
			case PaymentPackage.EFT_ACCOUNT__YEARS_AT_BANK:
				return yearsAtBank != YEARS_AT_BANK_EDEFAULT;
			case PaymentPackage.EFT_ACCOUNT__CONTACT_MECH_ID:
				return contactMechId != null;
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
		result.append(" (accountNumber: ");
		result.append(accountNumber);
		result.append(", accountType: ");
		result.append(accountType);
		result.append(", bankName: ");
		result.append(bankName);
		result.append(", companyNameOnAccount: ");
		result.append(companyNameOnAccount);
		result.append(", nameOnAccount: ");
		result.append(nameOnAccount);
		result.append(", routingNumber: ");
		result.append(routingNumber);
		result.append(", yearsAtBank: ");
		result.append(yearsAtBank);
		result.append(')');
		return result.toString();
	}

} //EftAccountImpl
