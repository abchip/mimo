/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.EmailAddressVerification;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Address Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl#getVerifyHash <em>Verify Hash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailAddressVerificationImpl extends BizEntityImpl implements EmailAddressVerification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailAddressVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return (String)eGet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		eSet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS, newEmailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpireDate() {
		return (Date)eGet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(Date newExpireDate) {
		eSet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE, newExpireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyHash() {
		return (String)eGet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyHash(String newVerifyHash) {
		eSet(ContactPackage.Literals.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH, newVerifyHash);
	}

} //EmailAddressVerificationImpl
