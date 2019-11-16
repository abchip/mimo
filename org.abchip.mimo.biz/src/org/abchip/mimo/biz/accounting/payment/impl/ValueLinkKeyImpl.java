/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.ValueLinkKey;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Link Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getCreatedByTerminal <em>Created By Terminal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getExchangeKey <em>Exchange Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getLastModifiedByTerminal <em>Last Modified By Terminal</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getLastWorkingKey <em>Last Working Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getWorkingKey <em>Working Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl#getWorkingKeyIndex <em>Working Key Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueLinkKeyImpl extends BizEntityImpl implements ValueLinkKey {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected static final String MERCHANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected String merchantId = MERCHANT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedByTerminal() <em>Created By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_TERMINAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedByTerminal() <em>Created By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByTerminal()
	 * @generated
	 * @ordered
	 */
	protected String createdByTerminal = CREATED_BY_TERMINAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getExchangeKey() <em>Exchange Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeKey()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExchangeKey() <em>Exchange Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeKey()
	 * @generated
	 * @ordered
	 */
	protected String exchangeKey = EXCHANGE_KEY_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedByTerminal() <em>Last Modified By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_TERMINAL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedByTerminal() <em>Last Modified By Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByTerminal()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByTerminal = LAST_MODIFIED_BY_TERMINAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastWorkingKey() <em>Last Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWorkingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_WORKING_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastWorkingKey() <em>Last Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWorkingKey()
	 * @generated
	 * @ordered
	 */
	protected String lastWorkingKey = LAST_WORKING_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String publicKey = PUBLIC_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingKey() <em>Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingKey() <em>Working Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingKey()
	 * @generated
	 * @ordered
	 */
	protected String workingKey = WORKING_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingKeyIndex() <em>Working Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long WORKING_KEY_INDEX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getWorkingKeyIndex() <em>Working Key Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingKeyIndex()
	 * @generated
	 * @ordered
	 */
	protected long workingKeyIndex = WORKING_KEY_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueLinkKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.VALUE_LINK_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByTerminal() {
		return createdByTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByTerminal(String newCreatedByTerminal) {
		String oldCreatedByTerminal = createdByTerminal;
		createdByTerminal = newCreatedByTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__CREATED_BY_TERMINAL, oldCreatedByTerminal, createdByTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchangeKey() {
		return exchangeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchangeKey(String newExchangeKey) {
		String oldExchangeKey = exchangeKey;
		exchangeKey = newExchangeKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__EXCHANGE_KEY, oldExchangeKey, exchangeKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByTerminal() {
		return lastModifiedByTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByTerminal(String newLastModifiedByTerminal) {
		String oldLastModifiedByTerminal = lastModifiedByTerminal;
		lastModifiedByTerminal = newLastModifiedByTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL, oldLastModifiedByTerminal, lastModifiedByTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastWorkingKey() {
		return lastWorkingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastWorkingKey(String newLastWorkingKey) {
		String oldLastWorkingKey = lastWorkingKey;
		lastWorkingKey = newLastWorkingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__LAST_WORKING_KEY, oldLastWorkingKey, lastWorkingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		String oldMerchantId = merchantId;
		merchantId = newMerchantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__MERCHANT_ID, oldMerchantId, merchantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKey(String newPublicKey) {
		String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__PUBLIC_KEY, oldPublicKey, publicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkingKey() {
		return workingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingKey(String newWorkingKey) {
		String oldWorkingKey = workingKey;
		workingKey = newWorkingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__WORKING_KEY, oldWorkingKey, workingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getWorkingKeyIndex() {
		return workingKeyIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingKeyIndex(long newWorkingKeyIndex) {
		long oldWorkingKeyIndex = workingKeyIndex;
		workingKeyIndex = newWorkingKeyIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.VALUE_LINK_KEY__WORKING_KEY_INDEX, oldWorkingKeyIndex, workingKeyIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.VALUE_LINK_KEY__MERCHANT_ID:
				return getMerchantId();
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_TERMINAL:
				return getCreatedByTerminal();
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case PaymentPackage.VALUE_LINK_KEY__CREATED_DATE:
				return getCreatedDate();
			case PaymentPackage.VALUE_LINK_KEY__EXCHANGE_KEY:
				return getExchangeKey();
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL:
				return getLastModifiedByTerminal();
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PaymentPackage.VALUE_LINK_KEY__LAST_WORKING_KEY:
				return getLastWorkingKey();
			case PaymentPackage.VALUE_LINK_KEY__PRIVATE_KEY:
				return getPrivateKey();
			case PaymentPackage.VALUE_LINK_KEY__PUBLIC_KEY:
				return getPublicKey();
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY:
				return getWorkingKey();
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY_INDEX:
				return getWorkingKeyIndex();
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
			case PaymentPackage.VALUE_LINK_KEY__MERCHANT_ID:
				setMerchantId((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_TERMINAL:
				setCreatedByTerminal((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__EXCHANGE_KEY:
				setExchangeKey((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL:
				setLastModifiedByTerminal((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_WORKING_KEY:
				setLastWorkingKey((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__PRIVATE_KEY:
				setPrivateKey((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__PUBLIC_KEY:
				setPublicKey((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY:
				setWorkingKey((String)newValue);
				return;
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY_INDEX:
				setWorkingKeyIndex((Long)newValue);
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
			case PaymentPackage.VALUE_LINK_KEY__MERCHANT_ID:
				setMerchantId(MERCHANT_ID_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_TERMINAL:
				setCreatedByTerminal(CREATED_BY_TERMINAL_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__EXCHANGE_KEY:
				setExchangeKey(EXCHANGE_KEY_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL:
				setLastModifiedByTerminal(LAST_MODIFIED_BY_TERMINAL_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__LAST_WORKING_KEY:
				setLastWorkingKey(LAST_WORKING_KEY_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__PUBLIC_KEY:
				setPublicKey(PUBLIC_KEY_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY:
				setWorkingKey(WORKING_KEY_EDEFAULT);
				return;
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY_INDEX:
				setWorkingKeyIndex(WORKING_KEY_INDEX_EDEFAULT);
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
			case PaymentPackage.VALUE_LINK_KEY__MERCHANT_ID:
				return MERCHANT_ID_EDEFAULT == null ? merchantId != null : !MERCHANT_ID_EDEFAULT.equals(merchantId);
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_TERMINAL:
				return CREATED_BY_TERMINAL_EDEFAULT == null ? createdByTerminal != null : !CREATED_BY_TERMINAL_EDEFAULT.equals(createdByTerminal);
			case PaymentPackage.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case PaymentPackage.VALUE_LINK_KEY__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PaymentPackage.VALUE_LINK_KEY__EXCHANGE_KEY:
				return EXCHANGE_KEY_EDEFAULT == null ? exchangeKey != null : !EXCHANGE_KEY_EDEFAULT.equals(exchangeKey);
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL:
				return LAST_MODIFIED_BY_TERMINAL_EDEFAULT == null ? lastModifiedByTerminal != null : !LAST_MODIFIED_BY_TERMINAL_EDEFAULT.equals(lastModifiedByTerminal);
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case PaymentPackage.VALUE_LINK_KEY__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PaymentPackage.VALUE_LINK_KEY__LAST_WORKING_KEY:
				return LAST_WORKING_KEY_EDEFAULT == null ? lastWorkingKey != null : !LAST_WORKING_KEY_EDEFAULT.equals(lastWorkingKey);
			case PaymentPackage.VALUE_LINK_KEY__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
			case PaymentPackage.VALUE_LINK_KEY__PUBLIC_KEY:
				return PUBLIC_KEY_EDEFAULT == null ? publicKey != null : !PUBLIC_KEY_EDEFAULT.equals(publicKey);
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY:
				return WORKING_KEY_EDEFAULT == null ? workingKey != null : !WORKING_KEY_EDEFAULT.equals(workingKey);
			case PaymentPackage.VALUE_LINK_KEY__WORKING_KEY_INDEX:
				return workingKeyIndex != WORKING_KEY_INDEX_EDEFAULT;
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
		result.append(" (merchantId: ");
		result.append(merchantId);
		result.append(", createdByTerminal: ");
		result.append(createdByTerminal);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", exchangeKey: ");
		result.append(exchangeKey);
		result.append(", lastModifiedByTerminal: ");
		result.append(lastModifiedByTerminal);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", lastWorkingKey: ");
		result.append(lastWorkingKey);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(", publicKey: ");
		result.append(publicKey);
		result.append(", workingKey: ");
		result.append(workingKey);
		result.append(", workingKeyIndex: ");
		result.append(workingKeyIndex);
		result.append(')');
		return result.toString();
	}

} //ValueLinkKeyImpl
