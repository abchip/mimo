/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.AuthMode;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway World Pay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getAuthMode <em>Auth Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isFixContact <em>Fix Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isHideContact <em>Hide Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isHideCurrency <em>Hide Currency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getInstId <em>Inst Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isNoLanguageMenu <em>No Language Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isWithDelivery <em>With Delivery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayWorldPayImpl extends BizEntityImpl implements PaymentGatewayWorldPay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayWorldPayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthMode getAuthMode() {
		return (AuthMode)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthMode(AuthMode newAuthMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE, newAuthMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFixContact() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixContact(boolean newFixContact) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT, newFixContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHideContact() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHideContact(boolean newHideContact) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT, newHideContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHideCurrency() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHideCurrency(boolean newHideCurrency) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY, newHideCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__INST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstId(String newInstId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__INST_ID, newInstId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangId(String newLangId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID, newLangId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoLanguageMenu() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoLanguageMenu(boolean newNoLanguageMenu) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU, newNoLanguageMenu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL, newRedirectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTestMode() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(long newTestMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE, newTestMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWithDelivery() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithDelivery(boolean newWithDelivery) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY, newWithDelivery);
	}

} //PaymentGatewayWorldPayImpl
