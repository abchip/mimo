/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway World Pay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isAuthMode <em>Auth Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isFixContact <em>Fix Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isHideContact <em>Hide Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isHideCurrency <em>Hide Currency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getInstId <em>Inst Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isNoLanguageMenu <em>No Language Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#isWithDelivery <em>With Delivery</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
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
	 * The default value of the '{@link #isAuthMode() <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTH_MODE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAuthMode() <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthMode()
	 * @generated
	 * @ordered
	 */
	protected boolean authMode = AUTH_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #isFixContact() <em>Fix Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixContact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIX_CONTACT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFixContact() <em>Fix Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixContact()
	 * @generated
	 * @ordered
	 */
	protected boolean fixContact = FIX_CONTACT_EDEFAULT;
	/**
	 * The default value of the '{@link #isHideContact() <em>Hide Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideContact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_CONTACT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHideContact() <em>Hide Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideContact()
	 * @generated
	 * @ordered
	 */
	protected boolean hideContact = HIDE_CONTACT_EDEFAULT;
	/**
	 * The default value of the '{@link #isHideCurrency() <em>Hide Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_CURRENCY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHideCurrency() <em>Hide Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideCurrency()
	 * @generated
	 * @ordered
	 */
	protected boolean hideCurrency = HIDE_CURRENCY_EDEFAULT;
	/**
	 * The default value of the '{@link #getInstId() <em>Inst Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstId()
	 * @generated
	 * @ordered
	 */
	protected static final String INST_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInstId() <em>Inst Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstId()
	 * @generated
	 * @ordered
	 */
	protected String instId = INST_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangId() <em>Lang Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangId()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangId() <em>Lang Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangId()
	 * @generated
	 * @ordered
	 */
	protected String langId = LANG_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isNoLanguageMenu() <em>No Language Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLanguageMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_LANGUAGE_MENU_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNoLanguageMenu() <em>No Language Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoLanguageMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean noLanguageMenu = NO_LANGUAGE_MENU_EDEFAULT;
	/**
	 * The default value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECT_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected String redirectUrl = REDIRECT_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected static final long TEST_MODE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected long testMode = TEST_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #isWithDelivery() <em>With Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_DELIVERY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWithDelivery() <em>With Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithDelivery()
	 * @generated
	 * @ordered
	 */
	protected boolean withDelivery = WITH_DELIVERY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfig paymentGatewayConfigId;

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
	public String getInstId() {
		return instId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstId(String newInstId) {
		String oldInstId = instId;
		instId = newInstId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__INST_ID, oldInstId, instId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangId() {
		return langId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangId(String newLangId) {
		String oldLangId = langId;
		langId = newLangId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID, oldLangId, langId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoLanguageMenu() {
		return noLanguageMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoLanguageMenu(boolean newNoLanguageMenu) {
		boolean oldNoLanguageMenu = noLanguageMenu;
		noLanguageMenu = newNoLanguageMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU, oldNoLanguageMenu, noLanguageMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		if (paymentGatewayConfigId != null && ((EObject)paymentGatewayConfigId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigId = (InternalEObject)paymentGatewayConfigId;
			paymentGatewayConfigId = (PaymentGatewayConfig)eResolveProxy(oldPaymentGatewayConfigId);
			if (paymentGatewayConfigId != oldPaymentGatewayConfigId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
			}
		}
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfig basicGetPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		PaymentGatewayConfig oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthMode() {
		return authMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthMode(boolean newAuthMode) {
		boolean oldAuthMode = authMode;
		authMode = newAuthMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE, oldAuthMode, authMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFixContact() {
		return fixContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixContact(boolean newFixContact) {
		boolean oldFixContact = fixContact;
		fixContact = newFixContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT, oldFixContact, fixContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHideContact() {
		return hideContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHideContact(boolean newHideContact) {
		boolean oldHideContact = hideContact;
		hideContact = newHideContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT, oldHideContact, hideContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHideCurrency() {
		return hideCurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHideCurrency(boolean newHideCurrency) {
		boolean oldHideCurrency = hideCurrency;
		hideCurrency = newHideCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY, oldHideCurrency, hideCurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		String oldRedirectUrl = redirectUrl;
		redirectUrl = newRedirectUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL, oldRedirectUrl, redirectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTestMode() {
		return testMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(long newTestMode) {
		long oldTestMode = testMode;
		testMode = newTestMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE, oldTestMode, testMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWithDelivery() {
		return withDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithDelivery(boolean newWithDelivery) {
		boolean oldWithDelivery = withDelivery;
		withDelivery = newWithDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY, oldWithDelivery, withDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE:
				return isAuthMode();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT:
				return isFixContact();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT:
				return isHideContact();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY:
				return isHideCurrency();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__INST_ID:
				return getInstId();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID:
				return getLangId();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU:
				return isNoLanguageMenu();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL:
				return getRedirectUrl();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE:
				return getTestMode();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY:
				return isWithDelivery();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				if (resolve) return getPaymentGatewayConfigId();
				return basicGetPaymentGatewayConfigId();
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
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE:
				setAuthMode((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT:
				setFixContact((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT:
				setHideContact((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY:
				setHideCurrency((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__INST_ID:
				setInstId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID:
				setLangId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU:
				setNoLanguageMenu((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL:
				setRedirectUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE:
				setTestMode((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY:
				setWithDelivery((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE:
				setAuthMode(AUTH_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT:
				setFixContact(FIX_CONTACT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT:
				setHideContact(HIDE_CONTACT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY:
				setHideCurrency(HIDE_CURRENCY_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__INST_ID:
				setInstId(INST_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID:
				setLangId(LANG_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU:
				setNoLanguageMenu(NO_LANGUAGE_MENU_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL:
				setRedirectUrl(REDIRECT_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE:
				setTestMode(TEST_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY:
				setWithDelivery(WITH_DELIVERY_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE:
				return authMode != AUTH_MODE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT:
				return fixContact != FIX_CONTACT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT:
				return hideContact != HIDE_CONTACT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY:
				return hideCurrency != HIDE_CURRENCY_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__INST_ID:
				return INST_ID_EDEFAULT == null ? instId != null : !INST_ID_EDEFAULT.equals(instId);
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__LANG_ID:
				return LANG_ID_EDEFAULT == null ? langId != null : !LANG_ID_EDEFAULT.equals(langId);
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU:
				return noLanguageMenu != NO_LANGUAGE_MENU_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL:
				return REDIRECT_URL_EDEFAULT == null ? redirectUrl != null : !REDIRECT_URL_EDEFAULT.equals(redirectUrl);
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE:
				return testMode != TEST_MODE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY:
				return withDelivery != WITH_DELIVERY_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				return paymentGatewayConfigId != null;
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
		result.append(" (authMode: ");
		result.append(authMode);
		result.append(", fixContact: ");
		result.append(fixContact);
		result.append(", hideContact: ");
		result.append(hideContact);
		result.append(", hideCurrency: ");
		result.append(hideCurrency);
		result.append(", instId: ");
		result.append(instId);
		result.append(", langId: ");
		result.append(langId);
		result.append(", noLanguageMenu: ");
		result.append(noLanguageMenu);
		result.append(", redirectUrl: ");
		result.append(redirectUrl);
		result.append(", testMode: ");
		result.append(testMode);
		result.append(", withDelivery: ");
		result.append(withDelivery);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayWorldPayImpl
