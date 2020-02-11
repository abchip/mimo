/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Link Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByTerminal <em>Created By Terminal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getExchangeKey <em>Exchange Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByTerminal <em>Last Modified By Terminal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastWorkingKey <em>Last Working Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKey <em>Working Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKeyIndex <em>Working Key Index</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey()
 * @model annotation="mimo-ent-frame title='Value Link Key Store'"
 * @generated
 */
public interface ValueLinkKey extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Created By Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By Terminal</em>' attribute.
	 * @see #setCreatedByTerminal(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_CreatedByTerminal()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCreatedByTerminal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByTerminal <em>Created By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By Terminal</em>' attribute.
	 * @see #getCreatedByTerminal()
	 * @generated
	 */
	void setCreatedByTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Exchange Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Key</em>' attribute.
	 * @see #setExchangeKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_ExchangeKey()
	 * @model
	 * @generated
	 */
	String getExchangeKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getExchangeKey <em>Exchange Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Key</em>' attribute.
	 * @see #getExchangeKey()
	 * @generated
	 */
	void setExchangeKey(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By Terminal</em>' attribute.
	 * @see #setLastModifiedByTerminal(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_LastModifiedByTerminal()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLastModifiedByTerminal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByTerminal <em>Last Modified By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By Terminal</em>' attribute.
	 * @see #getLastModifiedByTerminal()
	 * @generated
	 */
	void setLastModifiedByTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Working Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Working Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Working Key</em>' attribute.
	 * @see #setLastWorkingKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_LastWorkingKey()
	 * @model
	 * @generated
	 */
	String getLastWorkingKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastWorkingKey <em>Last Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Working Key</em>' attribute.
	 * @see #getLastWorkingKey()
	 * @generated
	 */
	void setLastWorkingKey(String value);

	/**
	 * Returns the value of the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Id</em>' attribute.
	 * @see #setMerchantId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_MerchantId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMerchantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getMerchantId <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Id</em>' attribute.
	 * @see #getMerchantId()
	 * @generated
	 */
	void setMerchantId(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_PrivateKey()
	 * @model
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_PublicKey()
	 * @model
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Working Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Key</em>' attribute.
	 * @see #setWorkingKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_WorkingKey()
	 * @model
	 * @generated
	 */
	String getWorkingKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKey <em>Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Key</em>' attribute.
	 * @see #getWorkingKey()
	 * @generated
	 */
	void setWorkingKey(String value);

	/**
	 * Returns the value of the '<em><b>Working Key Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Key Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Key Index</em>' attribute.
	 * @see #setWorkingKeyIndex(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getValueLinkKey_WorkingKeyIndex()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getWorkingKeyIndex();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKeyIndex <em>Working Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Key Index</em>' attribute.
	 * @see #getWorkingKeyIndex()
	 * @generated
	 */
	void setWorkingKeyIndex(long value);

} // ValueLinkKey
