/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_BY_TERMINAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByTerminal(String newCreatedByTerminal) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_BY_TERMINAL, newCreatedByTerminal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchangeKey() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__EXCHANGE_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchangeKey(String newExchangeKey) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__EXCHANGE_KEY, newExchangeKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByTerminal() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByTerminal(String newLastModifiedByTerminal) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL, newLastModifiedByTerminal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastWorkingKey() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_WORKING_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastWorkingKey(String newLastWorkingKey) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__LAST_WORKING_KEY, newLastWorkingKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__MERCHANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__MERCHANT_ID, newMerchantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivateKey() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__PRIVATE_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateKey(String newPrivateKey) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__PRIVATE_KEY, newPrivateKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicKey() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__PUBLIC_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKey(String newPublicKey) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__PUBLIC_KEY, newPublicKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkingKey() {
		return (String)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__WORKING_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingKey(String newWorkingKey) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__WORKING_KEY, newWorkingKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getWorkingKeyIndex() {
		return (Long)eGet(PaymentPackage.Literals.VALUE_LINK_KEY__WORKING_KEY_INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingKeyIndex(long newWorkingKeyIndex) {
		eSet(PaymentPackage.Literals.VALUE_LINK_KEY__WORKING_KEY_INDEX, newWorkingKeyIndex);
	}

} //ValueLinkKeyImpl
