/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingCrypto;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(TestPackage.Literals.TESTING_CRYPTO__ENCRYPTED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedValue(String newEncryptedValue) {
		eSet(TestPackage.Literals.TESTING_CRYPTO__ENCRYPTED_VALUE, newEncryptedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaltedEncryptedValue() {
		return (String)eGet(TestPackage.Literals.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaltedEncryptedValue(String newSaltedEncryptedValue) {
		eSet(TestPackage.Literals.TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE, newSaltedEncryptedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingCryptoId() {
		return (String)eGet(TestPackage.Literals.TESTING_CRYPTO__TESTING_CRYPTO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingCryptoId(String newTestingCryptoId) {
		eSet(TestPackage.Literals.TESTING_CRYPTO__TESTING_CRYPTO_ID, newTestingCryptoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingCryptoTypeId() {
		return (String)eGet(TestPackage.Literals.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingCryptoTypeId(String newTestingCryptoTypeId) {
		eSet(TestPackage.Literals.TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID, newTestingCryptoTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnencryptedValue() {
		return (String)eGet(TestPackage.Literals.TESTING_CRYPTO__UNENCRYPTED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnencryptedValue(String newUnencryptedValue) {
		eSet(TestPackage.Literals.TESTING_CRYPTO__UNENCRYPTED_VALUE, newUnencryptedValue);
	}

} //TestingCryptoImpl
