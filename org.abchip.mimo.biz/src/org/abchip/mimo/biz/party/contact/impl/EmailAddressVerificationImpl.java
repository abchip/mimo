/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailAddress = EMAIL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected Date expireDate = EXPIRE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyHash() <em>Verify Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyHash()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyHash() <em>Verify Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyHash()
	 * @generated
	 * @ordered
	 */
	protected String verifyHash = VERIFY_HASH_EDEFAULT;

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
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		String oldEmailAddress = emailAddress;
		emailAddress = newEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS, oldEmailAddress, emailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(Date newExpireDate) {
		Date oldExpireDate = expireDate;
		expireDate = newExpireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE, oldExpireDate, expireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyHash() {
		return verifyHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyHash(String newVerifyHash) {
		String oldVerifyHash = verifyHash;
		verifyHash = newVerifyHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH, oldVerifyHash, verifyHash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS:
				return getEmailAddress();
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE:
				return getExpireDate();
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH:
				return getVerifyHash();
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
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE:
				setExpireDate((Date)newValue);
				return;
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH:
				setVerifyHash((String)newValue);
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
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
				return;
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH:
				setVerifyHash(VERIFY_HASH_EDEFAULT);
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
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? emailAddress != null : !EMAIL_ADDRESS_EDEFAULT.equals(emailAddress);
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case ContactPackage.EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH:
				return VERIFY_HASH_EDEFAULT == null ? verifyHash != null : !VERIFY_HASH_EDEFAULT.equals(verifyHash);
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
		result.append(" (emailAddress: ");
		result.append(emailAddress);
		result.append(", expireDate: ");
		result.append(expireDate);
		result.append(", verifyHash: ");
		result.append(verifyHash);
		result.append(')');
		return result.toString();
	}

} //EmailAddressVerificationImpl
