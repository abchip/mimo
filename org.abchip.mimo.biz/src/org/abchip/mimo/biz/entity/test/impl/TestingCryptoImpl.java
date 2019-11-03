/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingCrypto;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Crypto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl#getTestingCryptoId <em>Testing Crypto Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl#getEncryptedValue <em>Encrypted Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl#getSaltedEncryptedValue <em>Salted Encrypted Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl#getTestingCryptoTypeId <em>Testing Crypto Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl#getUnencryptedValue <em>Unencrypted Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingCryptoImpl extends BizEntityImpl implements TestingCrypto {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingCryptoId() <em>Testing Crypto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingCryptoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_CRYPTO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingCryptoId() <em>Testing Crypto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingCryptoId()
	 * @generated
	 * @ordered
	 */
	protected String testingCryptoId = TESTING_CRYPTO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEncryptedValue() <em>Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEncryptedValue() <em>Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedValue()
	 * @generated
	 * @ordered
	 */
	protected String encryptedValue = ENCRYPTED_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSaltedEncryptedValue() <em>Salted Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaltedEncryptedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SALTED_ENCRYPTED_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSaltedEncryptedValue() <em>Salted Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaltedEncryptedValue()
	 * @generated
	 * @ordered
	 */
	protected String saltedEncryptedValue = SALTED_ENCRYPTED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingCryptoTypeId() <em>Testing Crypto Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingCryptoTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_CRYPTO_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingCryptoTypeId() <em>Testing Crypto Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingCryptoTypeId()
	 * @generated
	 * @ordered
	 */
	protected String testingCryptoTypeId = TESTING_CRYPTO_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnencryptedValue() <em>Unencrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnencryptedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String UNENCRYPTED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnencryptedValue() <em>Unencrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnencryptedValue()
	 * @generated
	 * @ordered
	 */
	protected String unencryptedValue = UNENCRYPTED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingCryptoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_CRYPTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptedValue() {
		return encryptedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedValue(String newEncryptedValue) {
		String oldEncryptedValue = encryptedValue;
		encryptedValue = newEncryptedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_CRYPTO__ENCRYPTED_VALUE, oldEncryptedValue, encryptedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaltedEncryptedValue() {
		return saltedEncryptedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaltedEncryptedValue(String newSaltedEncryptedValue) {
		String oldSaltedEncryptedValue = saltedEncryptedValue;
		saltedEncryptedValue = newSaltedEncryptedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE, oldSaltedEncryptedValue, saltedEncryptedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingCryptoId() {
		return testingCryptoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingCryptoId(String newTestingCryptoId) {
		String oldTestingCryptoId = testingCryptoId;
		testingCryptoId = newTestingCryptoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_ID, oldTestingCryptoId, testingCryptoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingCryptoTypeId() {
		return testingCryptoTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingCryptoTypeId(String newTestingCryptoTypeId) {
		String oldTestingCryptoTypeId = testingCryptoTypeId;
		testingCryptoTypeId = newTestingCryptoTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID, oldTestingCryptoTypeId, testingCryptoTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnencryptedValue() {
		return unencryptedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnencryptedValue(String newUnencryptedValue) {
		String oldUnencryptedValue = unencryptedValue;
		unencryptedValue = newUnencryptedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_CRYPTO__UNENCRYPTED_VALUE, oldUnencryptedValue, unencryptedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_ID:
				return getTestingCryptoId();
			case TestPackage.TESTING_CRYPTO__ENCRYPTED_VALUE:
				return getEncryptedValue();
			case TestPackage.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE:
				return getSaltedEncryptedValue();
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID:
				return getTestingCryptoTypeId();
			case TestPackage.TESTING_CRYPTO__UNENCRYPTED_VALUE:
				return getUnencryptedValue();
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
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_ID:
				setTestingCryptoId((String)newValue);
				return;
			case TestPackage.TESTING_CRYPTO__ENCRYPTED_VALUE:
				setEncryptedValue((String)newValue);
				return;
			case TestPackage.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE:
				setSaltedEncryptedValue((String)newValue);
				return;
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID:
				setTestingCryptoTypeId((String)newValue);
				return;
			case TestPackage.TESTING_CRYPTO__UNENCRYPTED_VALUE:
				setUnencryptedValue((String)newValue);
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
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_ID:
				setTestingCryptoId(TESTING_CRYPTO_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_CRYPTO__ENCRYPTED_VALUE:
				setEncryptedValue(ENCRYPTED_VALUE_EDEFAULT);
				return;
			case TestPackage.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE:
				setSaltedEncryptedValue(SALTED_ENCRYPTED_VALUE_EDEFAULT);
				return;
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID:
				setTestingCryptoTypeId(TESTING_CRYPTO_TYPE_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_CRYPTO__UNENCRYPTED_VALUE:
				setUnencryptedValue(UNENCRYPTED_VALUE_EDEFAULT);
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
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_ID:
				return TESTING_CRYPTO_ID_EDEFAULT == null ? testingCryptoId != null : !TESTING_CRYPTO_ID_EDEFAULT.equals(testingCryptoId);
			case TestPackage.TESTING_CRYPTO__ENCRYPTED_VALUE:
				return ENCRYPTED_VALUE_EDEFAULT == null ? encryptedValue != null : !ENCRYPTED_VALUE_EDEFAULT.equals(encryptedValue);
			case TestPackage.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE:
				return SALTED_ENCRYPTED_VALUE_EDEFAULT == null ? saltedEncryptedValue != null : !SALTED_ENCRYPTED_VALUE_EDEFAULT.equals(saltedEncryptedValue);
			case TestPackage.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID:
				return TESTING_CRYPTO_TYPE_ID_EDEFAULT == null ? testingCryptoTypeId != null : !TESTING_CRYPTO_TYPE_ID_EDEFAULT.equals(testingCryptoTypeId);
			case TestPackage.TESTING_CRYPTO__UNENCRYPTED_VALUE:
				return UNENCRYPTED_VALUE_EDEFAULT == null ? unencryptedValue != null : !UNENCRYPTED_VALUE_EDEFAULT.equals(unencryptedValue);
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
		result.append(" (testingCryptoId: ");
		result.append(testingCryptoId);
		result.append(", encryptedValue: ");
		result.append(encryptedValue);
		result.append(", saltedEncryptedValue: ");
		result.append(saltedEncryptedValue);
		result.append(", testingCryptoTypeId: ");
		result.append(testingCryptoTypeId);
		result.append(", unencryptedValue: ");
		result.append(unencryptedValue);
		result.append(')');
		return result.toString();
	}

} //TestingCryptoImpl
