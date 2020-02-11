/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Crypto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoId <em>Testing Crypto Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getEncryptedValue <em>Encrypted Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getSaltedEncryptedValue <em>Salted Encrypted Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoTypeId <em>Testing Crypto Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getUnencryptedValue <em>Unencrypted Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto()
 * @model
 * @generated
 */
public interface TestingCrypto extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypted Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Value</em>' attribute.
	 * @see #setEncryptedValue(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto_EncryptedValue()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getEncryptedValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getEncryptedValue <em>Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Value</em>' attribute.
	 * @see #getEncryptedValue()
	 * @generated
	 */
	void setEncryptedValue(String value);

	/**
	 * Returns the value of the '<em><b>Salted Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salted Encrypted Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salted Encrypted Value</em>' attribute.
	 * @see #setSaltedEncryptedValue(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto_SaltedEncryptedValue()
	 * @model annotation="mimo-ent-slot encrypt='SALT'"
	 *        annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getSaltedEncryptedValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getSaltedEncryptedValue <em>Salted Encrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salted Encrypted Value</em>' attribute.
	 * @see #getSaltedEncryptedValue()
	 * @generated
	 */
	void setSaltedEncryptedValue(String value);

	/**
	 * Returns the value of the '<em><b>Testing Crypto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Crypto Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Crypto Id</em>' attribute.
	 * @see #setTestingCryptoId(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto_TestingCryptoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingCryptoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoId <em>Testing Crypto Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Crypto Id</em>' attribute.
	 * @see #getTestingCryptoId()
	 * @generated
	 */
	void setTestingCryptoId(String value);

	/**
	 * Returns the value of the '<em><b>Testing Crypto Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Crypto Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Crypto Type Id</em>' attribute.
	 * @see #setTestingCryptoTypeId(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto_TestingCryptoTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingCryptoTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoTypeId <em>Testing Crypto Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Crypto Type Id</em>' attribute.
	 * @see #getTestingCryptoTypeId()
	 * @generated
	 */
	void setTestingCryptoTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Unencrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unencrypted Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unencrypted Value</em>' attribute.
	 * @see #setUnencryptedValue(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingCrypto_UnencryptedValue()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getUnencryptedValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getUnencryptedValue <em>Unencrypted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unencrypted Value</em>' attribute.
	 * @see #getUnencryptedValue()
	 * @generated
	 */
	void setUnencryptedValue(String value);

} // TestingCrypto
