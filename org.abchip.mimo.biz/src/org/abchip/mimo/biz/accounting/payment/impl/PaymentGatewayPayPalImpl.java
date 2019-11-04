/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Pay Pal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiEnvironment <em>Api Environment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiPassword <em>Api Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiSignature <em>Api Signature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiUserName <em>Api User Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getBusinessEmail <em>Business Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getConfirmTemplate <em>Confirm Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getConfirmUrl <em>Confirm Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getNotifyUrl <em>Notify Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#isRequireConfirmedShipping <em>Require Confirmed Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getShippingCallbackUrl <em>Shipping Callback Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayPayPalImpl extends BizEntityImpl implements PaymentGatewayPayPal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getApiEnvironment() <em>Api Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ENVIRONMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApiEnvironment() <em>Api Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String apiEnvironment = API_ENVIRONMENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getApiPassword() <em>Api Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String API_PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApiPassword() <em>Api Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiPassword()
	 * @generated
	 * @ordered
	 */
	protected String apiPassword = API_PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getApiSignature() <em>Api Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String API_SIGNATURE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApiSignature() <em>Api Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiSignature()
	 * @generated
	 * @ordered
	 */
	protected String apiSignature = API_SIGNATURE_EDEFAULT;
	/**
	 * The default value of the '{@link #getApiUserName() <em>Api User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String API_USER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApiUserName() <em>Api User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiUserName()
	 * @generated
	 * @ordered
	 */
	protected String apiUserName = API_USER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getBusinessEmail() <em>Business Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_EMAIL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBusinessEmail() <em>Business Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEmail()
	 * @generated
	 * @ordered
	 */
	protected String businessEmail = BUSINESS_EMAIL_EDEFAULT;
	/**
	 * The default value of the '{@link #getCancelReturnUrl() <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_RETURN_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCancelReturnUrl() <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String cancelReturnUrl = CANCEL_RETURN_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getConfirmTemplate() <em>Confirm Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_TEMPLATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConfirmTemplate() <em>Confirm Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmTemplate()
	 * @generated
	 * @ordered
	 */
	protected String confirmTemplate = CONFIRM_TEMPLATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getConfirmUrl() <em>Confirm Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConfirmUrl() <em>Confirm Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmUrl()
	 * @generated
	 * @ordered
	 */
	protected String confirmUrl = CONFIRM_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getNotifyUrl() <em>Notify Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFY_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNotifyUrl() <em>Notify Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyUrl()
	 * @generated
	 * @ordered
	 */
	protected String notifyUrl = NOTIFY_URL_EDEFAULT;
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
	 * The default value of the '{@link #isRequireConfirmedShipping() <em>Require Confirmed Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireConfirmedShipping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CONFIRMED_SHIPPING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRequireConfirmedShipping() <em>Require Confirmed Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireConfirmedShipping()
	 * @generated
	 * @ordered
	 */
	protected boolean requireConfirmedShipping = REQUIRE_CONFIRMED_SHIPPING_EDEFAULT;
	/**
	 * The default value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String returnUrl = RETURN_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getShippingCallbackUrl() <em>Shipping Callback Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingCallbackUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPPING_CALLBACK_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getShippingCallbackUrl() <em>Shipping Callback Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingCallbackUrl()
	 * @generated
	 * @ordered
	 */
	protected String shippingCallbackUrl = SHIPPING_CALLBACK_URL_EDEFAULT;
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
	protected PaymentGatewayPayPalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiEnvironment() {
		return apiEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiEnvironment(String newApiEnvironment) {
		String oldApiEnvironment = apiEnvironment;
		apiEnvironment = newApiEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT, oldApiEnvironment, apiEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiPassword() {
		return apiPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiPassword(String newApiPassword) {
		String oldApiPassword = apiPassword;
		apiPassword = newApiPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD, oldApiPassword, apiPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiSignature() {
		return apiSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiSignature(String newApiSignature) {
		String oldApiSignature = apiSignature;
		apiSignature = newApiSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE, oldApiSignature, apiSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiUserName() {
		return apiUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiUserName(String newApiUserName) {
		String oldApiUserName = apiUserName;
		apiUserName = newApiUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME, oldApiUserName, apiUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessEmail() {
		return businessEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessEmail(String newBusinessEmail) {
		String oldBusinessEmail = businessEmail;
		businessEmail = newBusinessEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL, oldBusinessEmail, businessEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancelReturnUrl() {
		return cancelReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReturnUrl(String newCancelReturnUrl) {
		String oldCancelReturnUrl = cancelReturnUrl;
		cancelReturnUrl = newCancelReturnUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL, oldCancelReturnUrl, cancelReturnUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmTemplate() {
		return confirmTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmTemplate(String newConfirmTemplate) {
		String oldConfirmTemplate = confirmTemplate;
		confirmTemplate = newConfirmTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE, oldConfirmTemplate, confirmTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmUrl() {
		return confirmUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmUrl(String newConfirmUrl) {
		String oldConfirmUrl = confirmUrl;
		confirmUrl = newConfirmUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL, oldConfirmUrl, confirmUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotifyUrl() {
		return notifyUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifyUrl(String newNotifyUrl) {
		String oldNotifyUrl = notifyUrl;
		notifyUrl = newNotifyUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL, oldNotifyUrl, notifyUrl));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL, oldRedirectUrl, redirectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireConfirmedShipping() {
		return requireConfirmedShipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireConfirmedShipping(boolean newRequireConfirmedShipping) {
		boolean oldRequireConfirmedShipping = requireConfirmedShipping;
		requireConfirmedShipping = newRequireConfirmedShipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING, oldRequireConfirmedShipping, requireConfirmedShipping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		String oldReturnUrl = returnUrl;
		returnUrl = newReturnUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL, oldReturnUrl, returnUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShippingCallbackUrl() {
		return shippingCallbackUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingCallbackUrl(String newShippingCallbackUrl) {
		String oldShippingCallbackUrl = shippingCallbackUrl;
		shippingCallbackUrl = newShippingCallbackUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL, oldShippingCallbackUrl, shippingCallbackUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT:
				return getApiEnvironment();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD:
				return getApiPassword();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE:
				return getApiSignature();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME:
				return getApiUserName();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL:
				return getBusinessEmail();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL:
				return getCancelReturnUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE:
				return getConfirmTemplate();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL:
				return getConfirmUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL:
				return getImageUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL:
				return getNotifyUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL:
				return getRedirectUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING:
				return isRequireConfirmedShipping();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL:
				return getReturnUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL:
				return getShippingCallbackUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT:
				setApiEnvironment((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD:
				setApiPassword((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE:
				setApiSignature((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME:
				setApiUserName((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL:
				setBusinessEmail((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL:
				setCancelReturnUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE:
				setConfirmTemplate((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL:
				setConfirmUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL:
				setNotifyUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL:
				setRedirectUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING:
				setRequireConfirmedShipping((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL:
				setReturnUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL:
				setShippingCallbackUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT:
				setApiEnvironment(API_ENVIRONMENT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD:
				setApiPassword(API_PASSWORD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE:
				setApiSignature(API_SIGNATURE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME:
				setApiUserName(API_USER_NAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL:
				setBusinessEmail(BUSINESS_EMAIL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL:
				setCancelReturnUrl(CANCEL_RETURN_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE:
				setConfirmTemplate(CONFIRM_TEMPLATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL:
				setConfirmUrl(CONFIRM_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL:
				setNotifyUrl(NOTIFY_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL:
				setRedirectUrl(REDIRECT_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING:
				setRequireConfirmedShipping(REQUIRE_CONFIRMED_SHIPPING_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL:
				setReturnUrl(RETURN_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL:
				setShippingCallbackUrl(SHIPPING_CALLBACK_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT:
				return API_ENVIRONMENT_EDEFAULT == null ? apiEnvironment != null : !API_ENVIRONMENT_EDEFAULT.equals(apiEnvironment);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD:
				return API_PASSWORD_EDEFAULT == null ? apiPassword != null : !API_PASSWORD_EDEFAULT.equals(apiPassword);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE:
				return API_SIGNATURE_EDEFAULT == null ? apiSignature != null : !API_SIGNATURE_EDEFAULT.equals(apiSignature);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME:
				return API_USER_NAME_EDEFAULT == null ? apiUserName != null : !API_USER_NAME_EDEFAULT.equals(apiUserName);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL:
				return BUSINESS_EMAIL_EDEFAULT == null ? businessEmail != null : !BUSINESS_EMAIL_EDEFAULT.equals(businessEmail);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL:
				return CANCEL_RETURN_URL_EDEFAULT == null ? cancelReturnUrl != null : !CANCEL_RETURN_URL_EDEFAULT.equals(cancelReturnUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE:
				return CONFIRM_TEMPLATE_EDEFAULT == null ? confirmTemplate != null : !CONFIRM_TEMPLATE_EDEFAULT.equals(confirmTemplate);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL:
				return CONFIRM_URL_EDEFAULT == null ? confirmUrl != null : !CONFIRM_URL_EDEFAULT.equals(confirmUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL:
				return NOTIFY_URL_EDEFAULT == null ? notifyUrl != null : !NOTIFY_URL_EDEFAULT.equals(notifyUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL:
				return REDIRECT_URL_EDEFAULT == null ? redirectUrl != null : !REDIRECT_URL_EDEFAULT.equals(redirectUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING:
				return requireConfirmedShipping != REQUIRE_CONFIRMED_SHIPPING_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL:
				return RETURN_URL_EDEFAULT == null ? returnUrl != null : !RETURN_URL_EDEFAULT.equals(returnUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL:
				return SHIPPING_CALLBACK_URL_EDEFAULT == null ? shippingCallbackUrl != null : !SHIPPING_CALLBACK_URL_EDEFAULT.equals(shippingCallbackUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID:
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
		result.append(" (apiEnvironment: ");
		result.append(apiEnvironment);
		result.append(", apiPassword: ");
		result.append(apiPassword);
		result.append(", apiSignature: ");
		result.append(apiSignature);
		result.append(", apiUserName: ");
		result.append(apiUserName);
		result.append(", businessEmail: ");
		result.append(businessEmail);
		result.append(", cancelReturnUrl: ");
		result.append(cancelReturnUrl);
		result.append(", confirmTemplate: ");
		result.append(confirmTemplate);
		result.append(", confirmUrl: ");
		result.append(confirmUrl);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", notifyUrl: ");
		result.append(notifyUrl);
		result.append(", redirectUrl: ");
		result.append(redirectUrl);
		result.append(", requireConfirmedShipping: ");
		result.append(requireConfirmedShipping);
		result.append(", returnUrl: ");
		result.append(returnUrl);
		result.append(", shippingCallbackUrl: ");
		result.append(shippingCallbackUrl);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayPayPalImpl
